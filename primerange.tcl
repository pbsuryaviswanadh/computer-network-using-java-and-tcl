gets stdin n
set count 0
for { set j 2 } { $j < $n } { incr j } {
set count 0
for { set i 2 } { $i < $j } { incr i } {
	if { [ expr $j%$i ] == 0 } {
		incr count
}
}
if { $count == 0 } {
	puts $j
} 
}

