gets stdin n
for { set i 1 } { $i <= $n } { incr i } {
for {set j 1 } { $j <= $i } { incr j} {
	puts -nonewline "#"
}
puts "         "
}

