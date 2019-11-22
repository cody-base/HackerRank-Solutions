# Given arrays of the whole words in a magazine and a ransom note, this challenge
# is to see if it is possible for the ransom note to be constructed using words
# cut out of the magazine.

sub checkMagazine 
{
    my @magazine = @{$_[0]};
    my @note = @{$_[1]};
    my %words;

    # Add all words from magazine, increasing frequency if found more than once
    for my $i (@magazine)
    {
        if (exists $words{$i})
        {
            $words{$i} = $words{$i}+1;
        }
        else
        {
            $words{$i} = 1;
        }
    }
    
    # Add all words from note, with -1 as initial frequency
    # Subtract 1 from frequency for all words already in words
    for my $j (@note)
    {
        if (exists $words{($j)})
        {
            $words{$j} = $words{$j}-1;
        }
        else
        {
            $words{$j} = -1;
        }
    }
        
    # If the value of a word is less than 0, magazine doesn't have enough of it
    for my $k (values %words)
    {
        if ($k < 0)
        {
            print ("No");
            return;        
        }
    }
    # If all values are zero or greater, a ransom note can be formed
    print ("Yes");
}
