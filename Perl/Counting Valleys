# Given a string named s, containing only the characters U and D, this challenge is 
# to count how many valleys a hiker enters based on 'U' being an uphill step and 'D'
# being a downhill step, starting from sea level. A valley is defined as having gone
# below sea level.

sub countingValleys 
{
    #Grab subroutine arguments, scalars for current height and number of valleys entered
    my ($s, $height, $valleys) = (@_[1], 0, 0);

    # Loop through steps string
    for my $c (split //, $s) 
    {
        # Increment height if we are going uphill, otherwise decrement height
        $c eq "U" ? $height++ : $height--;

        # If we're one below sea level after having just gone downhill, we entered a valley
        if ($height == -1 && $c eq "D")
        {
            $valleys++;
        }
    }
    # Return number of valleys entered
    return $valleys;
}
