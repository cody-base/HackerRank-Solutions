# Given an array containing only values of 0 and 1, this challenge is to count how many 'jumps'
# it takes to get from the start of the array to the end. A safe cloud value of 0 can be 'landed on' 
# while a storm cloud value of 1 must be 'jumped over'. A jump can only skip one value at the most.

sub jumpingOnClouds 
{
    # Grab subroutine argument, scalar to hold how many jumps are needed
    my @clouds = @{$_[0]};
    my $jumps = 0;

    # Loop through the cloud array ($#clouds is 1 less than the array length)
    for (my $i = 0; $i < $#clouds; $i++)
    {
        # If two clouds ahead is outside the array, jump one forward return jumps
        if ($i+2 > scalar @clouds)
        {
            $jumps++;
            return $jumps;
        }
        # If 2 clouds ahead is not a storm, jump two forward by increasing i
        if ($clouds[$i+2] != 1)
        {
            $i++;
            $jumps++;
        }
        # Otherwise (2 clouds ahead is a storm), jump one forward
        else
        {
            $jumps++;
        }
    }
    # Return how many jumps were needed
    return $jumps;
}
