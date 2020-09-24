#Create a simulator object
set ns [new Simulator]

$ns color 1 Blue
$ns color 2 Green

#Open the nam trace file
set nf [open out.nam w]
$ns namtrace-all $nf

#Define a 'finish' procedure
proc finish {} {
    global ns nf
    $ns flush-trace
    #Close the trace file
    close $nf
    #Executenam on the trace file
    exec nam out.nam &
    exit 0
}


#Create four nodes
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]
set n5 [$ns node]
set n6 [$ns node]


#Create links between the nodes
$ns duplex-link $n0 $n1 1Mb 10ms DropTail
$ns duplex-link $n0 $n2 1Mb 10ms DropTail
$ns duplex-link $n0 $n3 1Mb 10ms DropTail
$ns duplex-link $n0 $n4 1Mb 10ms DropTail
$ns duplex-link $n0 $n5 1Mb 10ms DropTail
$ns duplex-link $n0 $n6 1Mb 10ms DropTail

$ns duplex-link-op $n0 $n1 orient down
$ns duplex-link-op $n0 $n2 orient right-down
$ns duplex-link-op $n0 $n3 orient right-up
$ns duplex-link-op $n0 $n4 orient up
$ns duplex-link-op $n0 $n5 orient left-up
$ns duplex-link-op $n0 $n6 orient left-down

#Create a TCP agent and attach it to node n0
set tcp0 [new Agent/TCP]
$tcp0 set class_ 1
$ns attach-agent $n1 $tcp0
#Create a TCP Sink agent (a traffic sink) for TCP and attach it to node n6
set sink0 [new Agent/TCPSink]
$ns attach-agent $n2 $sink0
#Connect the traffic sources with the traffic sink
$ns connect $tcp0 $sink0


# Create a CBR traffic source and attach it to tcp0
set cbr0 [new Application/Traffic/CBR]
$cbr0 set packetSize_ 500
$cbr0 set interval_ 0.1
$cbr0 attach-agent $tcp0
#Schedule events for the CBR agents
$ns at 0.5 "$cbr0 start"
$ns at 2.5 "$cbr0 stop"

#Create a TCP agent and attach it to node n0
set tcp1 [new Agent/TCP]
$tcp1 set class_ 1
$ns attach-agent $n1 $tcp1
#Create a TCP Sink agent (a traffic sink) for TCP and attach it to node n5
set sink1 [new Agent/TCPSink]
$ns attach-agent $n5 $sink1
#Connect the traffic sources with the traffic sink
$ns connect $tcp1 $sink1


# Create a CBR traffic source and attach it to tcp1
set cbr1 [new Application/Traffic/CBR]
$cbr1 set packetSize_ 500
$cbr1 set interval_ 0.1
$cbr1 attach-agent $tcp1

$ns at 3.5 "$cbr1 start"
$ns at 5.5 "$cbr1 stop"


#Create a TCP agent and attach it to node n0
set tcp2 [new Agent/TCP]
$tcp2 set class_ 1
$ns attach-agent $n1 $tcp2
#Create a TCP Sink agent (a traffic sink) for TCP and attach it to node n3
set sink2 [new Agent/TCPSink]
$ns attach-agent $n3 $sink2
#Connect the traffic sources with the traffic sink
$ns connect $tcp2 $sink2


# Create a CBR traffic source and attach it to tcp2
set cbr2 [new Application/Traffic/CBR]
$cbr2 set packetSize_ 500
$cbr2 set interval_ 0.1
$cbr2 attach-agent $tcp2

$ns at 6.5 "$cbr2 start"
$ns at 8.5 "$cbr2 stop"

#Call the finish procedure after 9.0 seconds of simulation time
$ns at 9.0 "finish"

$ns run
