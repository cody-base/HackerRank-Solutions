# Given an array, a, and a number of rotations to perform, d, this challenge is
# to move the values in the array to the left d times, looping them from start
# to end so that after 2 rotations,
# 0 1 2 3 4 5
# turns into
# 2 3 4 5 0 1

sub rotLeft 
{
    # Grab subroutine arguments
    my $d = $_[1];
    my @arr = @{$_[0]};

    # Rotate d times
    for (1 .. $d)
    {
        # Rotate by shifting the first element off the array and pushing it onto the end
        push (@arr, shift @arr);
    }
    # Return the rotated array
    return @arr;
}
