# Given an array of colored socks, ar, and the length of the array, n, this
# challenge is to find how many pairs of colored socks exist.

sub sockMerchant 
{
    # Grab the subroutine arguments
    # Scalar for pairs found, hash for colors and their frequencies
    my $n = $_[0];
    my @arr = @{$_[1]};
    my $pairs;
    my %colors;
    
    # Make each array element a key and its frequency the value
    $colors{$_}++ for @arr;

    # Force integer division so that 1 / 2 = 0
    # Check each color for pairs, a pair exists each time a color frequency can be divided evenly by 2
    foreach my $value (values %colors)
    {
        use integer;
        $pairs += ($value / 2);
    }
    # Return how many pairs were found
    return $pairs;
}
