# cis-project
 This project is meant to have a Customer and casino Class objects. Casino offers 4 different games: Seven-Eleven, Blackjack, Slots, and High low
 
 To test the programs, it's ok the preset three customer and 3 casino object but each need a different name and balance.
 
 There is a main interface the uder and interact with. It has to options to:
        
        1. Create a new customer (if no name input or balance input, default will be ("Default customer", double 1000))
        
        2. Create a new Casino (if no name or balance input, default will be ("Default Casino", double 50000))
        
        3. Change a customer's name
        
        4. Change a Casino's name (at the price of -15000 from its balance)
        
        5. Play games as a customer
        
        6. Display customer details (only shows name and current balance)
        
        7. Display Casino details (only shows name and current balance)
 Each class object has an ID, name, and balance. Names can be changed after being created.
At no time can the balances from either object go below zero.

 Customer-specific requirements        
        
        1. You can create new customers
                a. All new customers have a new customerID assigned to them, starting with 1 for the first, 2 for the second, 3 for the third, ect.
                b. New customers have names and monetary balances 
                c. Default values are “default customer” for name and 1000 for balance
        2. You can add or subtract from a customer’s balance
                a. Customer balances cannot go below 0
        3. You can change a customer’s name
        4. You can display a customer’s name and his or her balance

Casino-specific requirements

        All casino games are played by a customer against the casino. In games with dealers, the dealers represent the casino.
        1) Any bets placed by the user and casino are deducted from the respective balances of both parties
        2) Lost bets are added to the casino balance. 
        3) Amounts lost by the casino are deducted from the casino balance and added to the customer’s balance. 
        4) If a bet would cause either a casino or customer balance to go negative, that bet cannot be placed. 
        5) Bets cannot be 0 or negative.
        
Game requirements

All casino games are played by a customer against the casino. In games with dealers, the dealers represent the casino.
        
        1)	Any bets placed by the user and casino are deducted from the respective balances of both parties
        2)	Lost bets are added to the casino balance. 
        3)	Amounts lost by the casino are deducted from the casino balance and added to the customer’s balance. 
        4)	If a bet would cause either a casino or customer balance to go negative, that bet cannot be placed. 
        5)	Bets cannot be 0 or negative.

Seven-Eleven

The game is played with dice. The objective of the game is to roll a seven or an eleven first.

Gameplay as follows:
        
        1. The user makes a bet, the casino matches the amount to create the pot
        2. The user and the casino each roll 2 six-sided dice simultaneously. The sum of both die is that player's total
                a. If a player rolls a 7 or 11 and the other does not, the player with the 7 or 11 wins
                b. If neither player rolls a 7 or 11, roll again
                c. If both players roll a 7 or if both players roll an 11, roll again
                d. If one player rolls a 7 and the other rolls an 11, the one who rolled an 11 wins
        3. The winner wins the pot and adds the money to their balance

Twenty-One

The game is played with cards. Number cards (2,3,4,5,6,7,8,9,10) are worth their shown values. Other cards (Jack, Queen, King, Ace) are worth 10. The objectives of the game are to get cards as close to the value of 21 without going over and to beat the dealer.  Assume the casino is using multiple decks for Twenty-One. Duplicates can be drawn in the same game. 

Gameplay is as follows:

        1. The user makes a bet, the casino matches the amount to create the pot
        2. 2 cards are dealt to the player, 2 cards are dealt to the dealer
                a. The user can see both of their cards and one of the dealer’s cards
        3. The user can choose to either draw a new card or stay with their current hand
        4. If a user chooses to draw and their hand total exceeds 21, the casino wins
        5. Once the user chooses to stay, the dealer will either draw a new card or stay 
                a.If the dealer’s hand is 17 or higher, they stay. If it is lower than 17, they draw 
        6. If the dealer draws and their hand total exceeds 21, the user wins 
        7. If both the dealer and the user stay, the totals are compared and the higher total wins
                a.In case of a tie, the customer receives the initial bet back
        8. The winner wins the pot and adds the money to their balance

Slots

Gameplay as follows:

        1. The user is asked for the number of spins
        2.	Every spin costs the customer 5, this is added to the casino balance
        3.	Each spin, one of the following outcomes occurs:
                a.	70% chance to win 1 from the casino
                b.	20% chance to win 5 from the casino
                c.	9% chance to win 10 from the casino
                d.	1% chance to win 100 from the casino
        4.	Display the amount the user won
        5.	Repeat steps 2 to 4 until the number of spins are complete 

High Low

The game is played with cards. The rank of the cards from low to high is as follows: A,2,3,4,5,6,7,8,9,10, Jack, Queen, King. The objective of the game is to guess whether the next card is going to be higher or lower than the current card. Assume the casino is using one deck for High Low, so no duplicates of cards can be drawn in the same game.

Gameplay as follows:

        1.	The user makes a bet, the casino matches the amount to create the pot
                a.	If this is not the first round, the new pot is combined with the previous pot
        2.	A card is drawn and shown to the user, the user guesses if the next card will be high or low. Ties are considered high
        3.	If incorrect, the casino wins 
        4.	If the user is correct, ask if they want to continue or if they want to stop. 
        5.	If the user continues, repeat steps 1 through 4 
        6.	If the user stops, the user wins
        7.	The winner wins the pot and adds the money to their balance
                a.	If the user won and guessed correctly at least 4 times, they win the pot and an additional 50 from the casino

