gets stdin n
set result 1
for { set i 1 } { $i <= $n } { incr i } { 
	set result [expr $result*$i]
}
puts $result
