# Given a string s, this challenge is to find how many substrings of the string
# are anagrams of each other.

sub sherlockAndAnagrams 
{
    # Grab subroutine argument, map to hold all possible substrings, string to hold each substring
    # Char array so we can sort each substring to easier compare, and a count for matches
    
    # isLen is due to how Perl's substr works. This is a port of my Java solution, where it is
    # String.substring(start, end). Perl's is subtr String, start, length. So instead of basing the
    # substring on j which will grab multiple characters after the first loop (where j is 2+ so the first
    # substring would be 2+ characters) AND grab the same substring multiple times since it will reach the 
    # end of the string faster, we use a decrementing scalar based on the string length.
    my $s = $_[0];
    my %mappy;
    my $sub;
    my @subA;
    my $count = 0;
    my $sLen = length($s)+1;

    # Get every substring from the string
    for (my $i = 0; $i < length($s); $i++)
    {
        # Decrement isLen each time $i, our start index, goes up
        $sLen -= 1;
        for (my $j = 1; $j <= $sLen; $j++)
        {
            # Get every substring from 1 character to s.length() characters long
            # Sort each substring by converting it into an array
            # Convert back to string for use in map checking
            $sub = substr $s, $i, $j;
            @subA = split //, $sub;
            @subA = sort {$a cmp $b} @subA;
            $sub = join('',@subA);

            # If the substring has already been found
            #  Since anagram pairs scale weird (aa is 1, aaa is 4, aaaa is 10), we increment weird 
            # Increment substring's value
            if (exists $mappy{$sub})
            {
                $count += $mappy{$sub};
                $mappy{$sub} = $mappy{$sub}+1;
            }
            # If this substring hasn't been found yet, add it to the map
            else
            {
                $mappy{$sub} = 1;
            }
        }
    }
    # Return how many substring anagrams were found
    return $count;
}
