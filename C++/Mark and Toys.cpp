/*
Given a vector of toy prices and a budget k, this challenge is to
find out how many items can be bought without going over the budget.
*/

int maximumToys(vector<int> prices, int k) 
{
    // Track total price and number of items that can be bought with the given budget
    int total = 0, num = 0;

    // Sort vector in ascending order
    sort(prices.begin(), prices.end());

    // Loop through prices vector
    for (int i = 0; i < prices.size(); i++)
    {
        // If the current price can be added to the running total without going over the budget
        // Do so and increment how many items can be bought
        if (total + prices[i] <= k)
        {
            total += prices[i];
            num++;
        }
        // Otherwise, we don't need to check any further and can stop looping
        else
            break;
    }
    
    // Return how many items can be bought with the given budget
    return num;
}
