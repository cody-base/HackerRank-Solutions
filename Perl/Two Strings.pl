# Given two strings, s1 and s2, this challenge is to determine if they
# share a common substring as small as a single character.

sub twoStrings 
{
    # Get subroutine arguments, map to track characters
    my $s1 = $_[0];
    my $s2 = $_[1];
    my %mappy;

    # Put each character in the first string s1 into the map
    # We don't care about frequencies so skip if character already there
    for my $c (split //, $s1)  
    {
        if (!exists $mappy{$c})
        {
            $mappy{$c} = $mappy{$c};
        }
    }

    # If the map contains any character from string s2, s1 and s2 share a substring
    for my $d (split //, $s2)
    {
        if (exists $mappy{$d})
        {
            return "YES";
        }
    }
    # If the map has no characters from s2, the strings share no characters
    return "NO";
}
