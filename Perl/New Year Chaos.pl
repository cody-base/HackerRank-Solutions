# Given an array representing the final state of a line queue, this challenge is 
# to determine how many bribes must have happened for the line to end up like that.
# A person can bribe at most 2 others in line. If it's not possible to achieve this
# with the given array, it is too chaotic. Lines start in ascending order.

sub minimumBribes 
{
    # Grab subroutine argument, scalar to hold 
    my @arr = @{$_[0]};
    my $count = 0;

    # Bribes happen forward so loop right to left following problem logic
    for (my $i = (scalar @arr)-1; $i >= 0; $i--)
    {
        # Need formula based on i to see if checked value is more than 2 forward
        # Formula must also not ring true for values more than 2 backward
        # q[i] - i works, making small values at higher indexes negative
        # But if 1 is at the first index, this would be 1 - 0 = 1. We get one higher than we're supposed to.
        if (($arr[$i] - ($i+1)) > 2)
        {
            # More than 2 forward, too chaotic. Return to exit loop and skip printing count.
            print "Too chaotic\n";
            return;
        }
        else
        {
            # If the current element isn't more than 2 ahead, count how many times it went forward
            # Check left to right for this, starting at the higher of 0 and element value - 2
            # 0 for first in line, value - 2 because it has gone forward at most 2 spots
            # Max function because if the value is low, subtracting 2 might go under 0 and error out
            # Go to i, where the element we're looking at in the outer loop is
            for (my $j = max (0,$arr[$i]-2); $j < $i; $j++)
            {
                # If this element is greater than what we're looking at, it has been moved forward
                if ($arr[$j] > $arr[$i])
                {
                    $count++;
                }
            }
        }
    }
    # Print the fewest amount of bribes needed to create the array instance 
    print "$count\n";
}
