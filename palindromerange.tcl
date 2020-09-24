gets stdin a
for { set i 1 } { $i < $a } { incr i } {
set b $i
set c $i
set rem 0
set rev 0
while { $b != 0 } {
	set rem [ expr $b%10 ]
	set rev [expr $rev*10 +$rem ]
	set b [expr $b/10 ]
}
if { $c == $rev } {
	puts $rev
}
}
