gets stdin a
set b $a
set rem 0
set rev 0
while { $a != 0 } {
	set rem [ expr $a%10 ]
	set rev [expr $rev*10 +$rem ]
	set a [expr $a/10 ]
}
if { $b == $rev } {
	puts "$b is palindrome"
} else {
	puts "$b is not palindrome"
}
