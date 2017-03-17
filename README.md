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
|Application accesses guest property|15|15|
|Application accesses food property|burrito bar|burrito bar|
|Application accesses drink property|beer and wine|beer and wine|
|Application accesses entertainment property|petting zoo|petting zoo|
|Application calculates cost based on food per person|20, burrito bar|160|
|Application calculates cost based on drinks per person|20, beer and wine|240|
|Application calculates cost based on entertainment choice|petting zoo|600|
|Application calculates cost based on all chosen properties|20, burrito bar, beer and wine, petting zoo|1000|


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
