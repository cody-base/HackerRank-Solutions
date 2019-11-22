# Given an infinitely repeated string s, this challenge is to find how many
# times the character 'a' is repeated in the first n characters.

sub repeatedString 
{
    # Grab subroutine arguments
    # Scalars to count a's, how many times s can be fully repeated until n, letters left over that couldn't be fully repeated
    my ($s, $n) = @_;
    my ($count, $sum, $rem) = (0,0,0);

    # If there are no a's, return 0
    if ($s !~ /a/)
    {
        return 0;
    }

    # Find number of a's in the string s
    for my $c (split //, $s)
    {
        if ($c eq 'a')
        {
            $count++;
        }
    }

    # If the string is all a's, return n
    if ($count == length($s))
    {
        return $n;
    }

    {   
        # Force integer operations to find sum, how many a's are in sum, and rem
        use integer;
        $sum = ($n / length($s));
        $count = $sum * $count;
        $rem = ($n % length($s))-1;
    }

    # Find how many a's are in the string that couldn't be fully repeated
    for my $i (0 .. $rem)
    {
        my $char = substr($s, $i, 1);
        if ($char eq 'a')
        {
            $count++;
        }
    }
    # Return how many a's were found
    return $count;
}
