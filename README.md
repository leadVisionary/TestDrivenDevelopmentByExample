To Do:
- Make "amount" private
- Dollar side-effects?
- Money rounding?

Features:
- Multi-currency calculation
Scenario: In order to be able to trade currency internationally 
          As an investor
		 I want to be able to add amounts of different currencies

	Scenario: $5+ 10 CHF = $10 if exchange rate is 2:1
	Given : I have $5 and 10 CHF
	And : The exchange rate is 2:1
	When : I add them together
	Then : The result is $10
	
	Scenario: $5 *2
	Given: I have $5
	When : I multiply it by 2
	Then: The result should be $10
	
	Scenario: Account for taxes
	In order to be able to account for taxes
	As an investor
	When I multiply my money by a number, the the result should be discounted by the tax rate
	
	