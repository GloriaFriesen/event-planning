# Event Planning

#### Event Planning Cost Builder, Current Version: 03/17/2017

#### By Gloria Friesen

## Description
This Java application allows the user to build a party based on number of guests, food, drinks, and entertainment and calculates pricing based on selected options.

## Setup/Installation Instructions
* In your web browser of choice, go to: <http://github.com/GloriaFriesen/event-planning>
* Clone repository
* In terminal
  * Switch to event-planning directory
  * Compile with command: $ gradle compileJava
  * Navigate to the build directory: $ cd build/classes/main
  * Launch the application: $ java App
  * Follow prompts and enter choices to see your calculated party price

## Specifications

|Behavior|Input|Output|
|:---:|:---:|:---:|
|Application instantiates Event class|event|true|
|Application accesses guest property|20|20|
|Application calculates price based on food option|burrito bar|300|
|Application calculates price based on drink option|beer and wine|200|
|Application calculates price based on entertainment option|petting zoo|600|
|Application calculates party price based on options selected|20, burrito bar, beer and wine, petting zoo|1100|
|Application calculates value of coupon code|"iHaveACouponCode"|-50|
|Application calculates value of another coupon code that requires a minimum number of guests|"letsgetthispartystarted"|-150|
|Application calculates cost based on all chosen properties|20, burrito bar, beer and wine, petting zoo, "iHaveACoupon"|1050|


## Known Bugs
We'll see.

## Support and contact details
Questions? Concerns? Suggestions? Reach out to me via github: <https://github.com/GloriaFriesen>.

## Technologies Used
* _Java_
* _Gradle_
* _JUnit_

## License
This software is licensed under the MIT license.
Copyright (c) 2017 Gloria Friesen.
