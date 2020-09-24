gets stdin a
gets stdin b
gets stdin c
if { $a > $b } {
	if { $a > $c } { 
		puts "a is greatest"
} else { 
	puts "c is greatest"	
}
} elseif { $b > $a } {
	if { $b > $c } {
	puts "b is greatest"
} else {
	puts "c is greatest"
}
}
