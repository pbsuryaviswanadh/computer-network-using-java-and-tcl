gets stdin n
set count 0
for { set i 2 } { $i < $n } { incr i } {
	if { [ expr $n%$i ] == 0 } {
		incr count
}
} 
if { $count == 0 } {
	puts "$n is prime"
} else {
	puts "$n is not prime"
}
