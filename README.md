# INDEX

- [PROJECT DESCRIPTION](#project-description)
- [TEST APPROACH](#test-approach)
    - [TEST LEVELS](#test-levels)
        - [UNIT TESTING](#unit-testing)
        - [INTEGRATION TESTING](#integration-testing)
        - [SYSTEM TESTING](#system-testing)
- [TEST MANAGEMENT](#test-management)
    - [JIRA AND ZEPHYR SCALE](#jira--zephyr-scale)
    - [TEST PLANS](#test-plans)
        - [Sprint 1](#sprint-1)
        - [Sprint 2](#sprint-2)
        - [Sprint 3](#sprint-3)
    - [TEST ARTIFACTS](#test-artifacts)
       
- [AGILE METRICS](#agile-metrics)
- [DEFECT MANAGEMENT](#defect-management)



# PROJECT DESCRIPTION

Tax Calculator is a user-friendly and efficient web-based application designed to help individuals calculate their income tax liability accurately and easily. The platform aims to simplify the process of calculating taxes by providing a user-friendly interface that enables users to input their financial data and receive instant tax calculations based on the prevailing tax laws and regulations.

> Tools used: <br />
> JIRA | IntelliJ | Postman | Selenium | Cucumber | AxeDev |


<div style="display: flex; justify-content: center;align-items: center; margin: 0;">
    <img src="Assets/atlassian_jira-ar21.png" alt="Image 2" style="height: 60px; margin: 0px;">
    <img src="Assets/IntelliJ_IDEA_Icon.svg.png" alt="Image 2" style="height: 60px; margin: 0px;">
    <img src="Assets/postman-inc-logo-vector.png" alt="Image 2" style="height: 60px; margin: 0px;">
    <img src="Assets/selenium.png" alt="Image 2" style="height: 60px; margin: 0px;">
     <img src="Assets/0_6T0D8OjInvZhyHDE.png" alt="Image 2" style="height: 60px; margin: 0px;">
     <img src="Assets/jenkins8460.jpg" alt="Image 2" style="height: 60px; margin: 0px;">
     <img src="Assets/axe-rebrand.png" alt="Image 2" style="height: 60px; margin: 0px;">
</div>

<!-- ----------------------------------------------------------------------------------------------------------------- -->


# TEST APPROACH

By adopting the **Attribute, Component, and Capability** (ACC) testing approach, we aim to ensure comprehensive testing of the Tax Calculator. This approach allows us to focus on critical attributes, components, and capabilities, ensuring that the Tax calculator is secure, compliant, auditable, accessible to all users, and responsive across various devices and browsers. The ACC approach will help us identify and address potential issues early in the development process, ultimately delivering a high-quality, user-friendly, and reliable Tax Calculator to our users.

> Note: <br />
> **Secure**, **Auditable** attribute are out of scope as MVP(Minimum viable product) did not require a login functionality to maintain security at this stage and also doest hold any records to consider an audit.

- Compliance: Focus in testing any expected results or acceptance criteria.
- Accessible: Focus in testing the application from the perspective of a person with different abilities
- Responsive: Focus in testing the application in different browsers and screen dimensions

## TEST LEVELS


### Unit testing

[UI Component Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/UI%20test%20cases.png)

Unit testing  focuses on testing individual units or components of the software in isolation.
The goal is to verify that each unit works as expected.Unit testing is highly valuable for detecting and fixing defects early in the development cycle.
In the Tax Calculator there are for 4 unit been considered as MVP. Input field, button, Tax Summary report, Error Message.

>Note:<br/>
> In regards Compliance, Auditable, Accessible, Responsive focused while testing
> - Input field: Placeholder the word 'Income' has been added. In parallel Accessible, Responsive attributes been considered while conducting testing.
> - Button: Label 'Calculate Tax' has been added. In parallel Accessible, Responsive attributes been considered while conducting testing.
> - Tax Summary report: 'Total tax', 'Tax Bracket' fields has been added. In parallel Accessible, Responsive attributes been considered while conducting testing.
> - Error message: 'An error occurred while calculating tax.' required error message has been added.  In parallel Accessible, Responsive attributes been considered while conducting testing.


### Integration testing

[API Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Income%20Tax%20Calculation-API-Test%20analysis%20and%20design.pdf)

API testing is a crucial aspect of ensuring the functionality, reliability, and security of the Tax Calculator application.
As the Tax Calculator involves user interactions and data processing,
API testing focuses on testing the various endpoints and functionalities exposed by the application's backend API. 
There are some testing considered while conducting the Tax Calculator API testing.

1. Endpoint Testing:
    API testing begins by verifying the functionality of individual API endpoints.
    For the Tax Calculator, this includes testing the API endpoints responsible for handling user interactions, such as the income tax calculation.
    We ensure that the API endpoints accept the correct input data, process it accurately, and provide the expected output, which may include in the summary report.
---

2. Input Validation:
    In API testing for the Tax Calculator, we thoroughly validate the input data provided to the API endpoints.
    This involves testing boundary values, negative scenarios, to ensure that the API handles various input scenarios correctly.
    We verify that the API returns appropriate error responses for invalid inputs and that it maintains data integrity during processing.
---

3. Data Accuracy and Consistency:
    API testing includes validating the accuracy and consistency of the data returned by the endpoints.
    We compare the calculated tax amount to be paid as well as the tax bracket from the API with the expected results based on predefined test cases.
    Additionally, we verify that the API data aligns with data from other parts of the application, such as the frontend input field and summary report component, to ensure data synchronization.
>Note:<br/>
> Data synchronization considered during System Testing
---
4. API Response Validation:
    We thoroughly examine the API responses to ensure they adhere to the defined API specifications and contracts.
    This includes validating the response status codes, headers, and payload formats.
    We also confirm that the API responses include relevant information, such as tax calculations, in a well-structured and readable manner.
>Note:<br/>
> Json delivered a readable output
---
5. Error Handling and Logging:
    API testing involves verifying the API's error handling capabilities.
    We test various error scenarios, such as invalid endpoints, incorrect input formats and check that the API returns appropriate error responses.
    Additionally, we ensure that the API logs relevant error details to facilitate troubleshooting.
---
6. Performance and Load Testing:
    API testing extends to performance and load testing.
    We evaluate the API's response times, throughput, and resource utilization under different load conditions to identify potential bottlenecks and optimize performance.

![](Assets/113_iterations.png)
---

### System testing

[System Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/System%20test%20cases.png)

System testing for the Tax Calculator involves evaluating the entire application as a whole to ensure that it functions correctly and meets all the specified requirements.
Our main objective was to test the integrated system components and their interactions to verify that the Tax Calculator works seamlessly from end to end. 
Also, to validate the system's behavior and performance in a real-world environment, simulating user interactions and various scenarios.
There are some aspect considered while conducting the Tax Calculator System testing.


1. End-to-End Functionality:
    System testing ensures that all components of the Tax Calculator, including the button, input field, summary report and error message function as expected when used together.
    It tests the complete flow of the application, from entering income through the input field to displaying the accurate tax calculation result in the summary report.

---

2. Integration Verification:
    System testing checks the integration of the individual components, ensuring they work smoothly as an integrated unit.
    It validates that data is appropriately passed between components, and interactions between different parts of the system function smoothly.

---

3. Use Case Testing:
    Different use cases are tested to cover various scenarios, such as different income levels.
    System testing ensures that the Tax Calculator produces accurate results for a range of real-world tax scenarios.

---
4. Boundary and Stress Testing:
    The application is subjected to boundary value testing to validate its behavior when input values are at the lower and upper limits.

---
5. User Interface Validation:
    System testing verifies that the user interface is user-friendly, intuitive, and consistent. 
    It ensures that the button and input field are visually appealing,the summary report component displays the results in a clear and understandable format and,
    error message component visually appealing as an informative message.

---
7. Compatibility Testing:
    The Tax Calculator is tested on various browsers and devices to ensure compatibility across different platforms,
    ensuring that users can access and use the application seamlessly.

---
8. Error Handling and Recovery:
    System testing evaluates how the application responds unexpected inputs. It ensures that error messages are meaningful and provide guidance to users for resolving issues.

---
9. Performance Evaluation:
    System testing assesses the overall performance of the Tax Calculator, including response times and resource utilization.
    It ensures that the application performs efficiently even during peak usage.

---
10. Regression Testing:
    Any changes or updates to the Tax Calculator are verified with regression testing to ensure that existing functionality remains unaffected.
---
11. Accessibility Testing:
    Focusing on ensuring that the Tax Calculator is usable by individuals with different abilities. Main concern were Keyboard navigation and color contrast.

### Acceptance testing

In the sprint review, the team conducted a demonstration of the Tax Calculator, treating it as an acceptance testing phase.
During this review, the primary focus was to showcase the Tax Calculator's functionality and demonstrate that it meets the acceptance criteria
and business requirements defined for the sprint.

During the sprint review, the team presented the key features of the Tax Calculator, including the button for tax calculation, the input field to add income,
and the summary report component displaying the calculated result.
The team showcased various scenarios, such as different income levels to demonstrate the Tax Calculator's accuracy.

Stakeholders actively participated in the review, providing valuable feedback on the Tax Calculator's functionality, user interface, and overall user experience.
The  issues or concerns raised during the review were noted and prioritized for resolution in subsequent sprints or development cycles.




## Test Types

### Black Box

#### Functional

1.Boundary Value Analysis:

Perform boundary value testing to check the application's behavior at the edge of input ranges.
Test the Tax Calculator with inputs just below and above the lower and upper income boundaries to ensure it calculates taxes accurately.

2.Equivalence Partitioning:

Apply equivalence partitioning to divide the input space into equivalent classes and test representative inputs from each class.
Test the Tax Calculator with multiple income values within each partition to validate consistent tax calculations.

#### Non-functional

---
### White Box

1. Statement Coverage Testing:

Verify that each line of code in the Tax Calculator's implementation is executed at least once during testing.
Ensure that all code statements are reachable and tested to detect any potential logic errors or dead code.
 


2. Branch Coverage Testing:

Test different branches and decision points in the code to ensure that all possible scenarios are evaluated.
Check if conditional statements, loops, and logical operators are adequately tested to cover both true and false conditions.



<!-- ----------------------------------------------------------------------------------------------------------------- -->

# TEST MANAGEMENT

## JIRA & Zephyr scale

## Test Plans

### Sprint 1
[Artifacts](#test-artifacts)


- **Date -** May 22nd, 2023 - June 5th, 2023

- **Sprint goal -** Develop components which required for MVP Tax Calculation


During the initial sprint 1, the development was creating components that helps the MVP of the tax calculator. This includes designing and implementing key components such as the income input field, summary report display, calculate button, and an error message mechanism. The income input field will allow user to provide their income, while the summary report display the Tax to paid and the correct Tax bracket in understandable format. The calculate button will call the API and continue the tax calculating formula, to deliver an accurate outcome. To ensure a user-friendly experience, an error handling message component will be established, promptly notifying users of any input mistakes or issues.

Sprint guided by the development team's, Rafael, the Developer. The collaboration of Mithila, Amila and Dinuka, Testers, provided valuable insights during the testing phase, ensuring that mentioned components seamlessly present according to the clients requirements. While the primary objective of this sprint is to establish the foundation of the application, considerations for interaction with API, accuracy and error handling proceeded in next sprint. As the sprint progresses, the development team will look into adhering to the project's scope and requirements, striving for a successful tax calculating application.


>Note:<br/>
> Main focus was to develop and test UI components
>  - Income input field
>  - Calculate button
>  - Summary report
>  - Error message

### Sprint 2
[Artifacts](#test-artifacts)


- **Date -** June 5th, 2023 - June 19th, 2023

- **Sprint goal -** Execute the remaining component testing diligently, conduct API testing, and implement effective time management practices.


During the sprint 2, the main focus was on developing and rigorously testing a tax calculation API to deliver accurate tax estimations according to the income provided. The API's functionality, including retrieving tax brackets, tax to be paid and ensuring secure communication via HTTPS. Thorough testing by a collaborative team, with Rafael leading as the Developer, addressed key aspects such as behavior validation, load, and error handling. As a tester myself and other testers Amila, and Dinuka, played a significant role in identifying defects, vulnerabilities, and accuracy of tax calculations.
The sprint's successful outcome showcased the team's dedication to building a robust API and also marked a significant step after developed the API as the requirements with a reliable and accurate tax calculation formula, leaving for further development and refinement.

>Note:<br/>
> Main focus was to retrieve 
>  - Retrieving Tax brackets
>  - Find Tax bracket
>  - Tax amount when income given 

### Sprint 3
[Artifacts](#test-artifacts)

- **Date -** June 19th, 2023 - July 3rd, 2023
- **Sprint goal** - Utilize Selenium, Cucumber for automating UI testing, ensuring seamless completion of testing for to deploy Tax Calculator application.

During the Sprint 3 our focus shifted to Tax Calculator UI testing and its relevant automation. Our main focus was carefully checking that the tax calculator shown on the screen were correct in all perspective, making sure the user interface worked well, was easy to use and delivering the right results. This helped make the Tax Calculator better for people using it. We were the same team guided by Rafael's developmental leadership and with testers Mithila, Amila, and Dinuka, we made sure a bug free final product.

This sprint full filled with rigorous testing, advanced tools, and dynamic environments. By using Selenium, Cucumber, Jenkins alongside development, testing, we were able to simulated real-world scenarios easier as well as continues testing, ensuring the application's reliability. Sprint 3 showed how well we worked together as a team and made big progress in making the Tax Calculator bug-free paying a lot of attention to how it looks and works for users.



## Test Artifacts
>Note:<br/>
> The collected test artifacts throughout the development of the Tax Calculator spanned across Sprint 1, 2, and 3.


Test plans and Impact analysis 
: 

- [Impact Analysis](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/impact%20analysis.jpg)
- [**Sprint 1:** Test plan](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Test%20plan%201.jpg)
- [**Sprint 2:** Test plan](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Test%20plan%202.jpg)
- [**Sprint 3:** Test plan](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Test%20plan%203.jpg)

Test analysis and design
: 

- [Income Tax Calculation-UI-Test analysis and design](https://docs.google.com/document/d/1RmNcYZimInADYbaS5WCcUtNw1NeDR47olZXLoImyVE8/edit)
- [Income Tax Calculation-API-Test analysis and design](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Income%20Tax%20Calculation-API-Test%20analysis%20and%20design.pdf)
- [Income Tax Calculation-System-Test analysis and design](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/Test%20analysis%20and%20design-%20System.pdf)

Test suits
: 

- [UI Component Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/UI%20test%20cases.png)
- [API Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/API%20test%20cases.png)
- [System Test Suit](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/Assets/System%20test%20cases.png)

Test cycles
: 

- [UI cycle](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/TestCycles.md#ui)
- [API cycle](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/TestCycles.md#api)
- [System cycle](https://github.com/Mithila-Kuda/TaxCalUIAutomation/blob/main/TestCycles.md#system)

Defect reports
: 

- [The input field accept multiple decimals]()
- [The input field accept negative decimals]()
- [The find tax bracket endpoint did not retrieve tax percentage for minimum income values]()
- [Negative Input Accepted by Find Tax Bracket Endpoints]()
- [Negative Input gives internal server error when calculating Tax]()
- [In the summary report 'Total tax to be paid' display more than two decimal places]()
- [For the  inserted income '$14,000.50', instead of showing the summary report with the 'Total Tax to be paid', displaying an error message "An error occurred while calculating tax."]()


<!-- ----------------------------------------------------------------------------------------------------------------- -->
# AGILE METRICS

In our agile work process, we initially planned for 15 points which covered tasks related to setting up the Tax Calculator UI, Tax Calculator API, and Tax Calculator System. However, due to some issues in estimating the work and the fact that most of us are new to the team, we faced delays and had tasks piling up. By the end of the first sprint, we couldn't complete all the planned work as expected.

To handle this, we made smart changes for the next sprint. We focused on UI and API tasks, giving them a total of 10 points, while we left the 'System' task for the third sprint. In the second sprint, we worked hard and accomplished the 10 points we set. Since we had some extra time during the second sprint, we decided to work on the Tax Calculator System story as well, which we decided to do in third sprint. We assigned it 5 points and managed to complete it within the second sprint also while fixing the defects introduced. Then We left the third sprint for automating UI testing.

Our agile approach isn't just about counting points; it's about being adaptable and finding the best ways to work together. We're learning how to handle challenges and make things better as a team, and that's what matters most.


>Note:<br/>
>The following **Burnup reports** provide insights into the progress made during Sprint 1 and Sprint 2.
These showcase a clear overview of the tasks completed and the accomplishments over each sprint.

![Burnupchart sprint 1](/Assets/Burnup%20report%20Sprint%201.png)
![Burnupchart sprint 1](/Assets/Burnup%20report%20Sprint%202.png)
<!-- ----------------------------------------------------------------------------------------------------------------- -->
# DEFECT MANAGEMENT
[Artifacts](#test-artifacts)

For each defect discovered during the development of the Tax Calculator, we followed a consistent and clear reporting format.

>Note:<br/>
> Consider the following defect
> 
>**For the inserted income '$14,000.50', instead of showing the summary report with the 'Total Tax to be paid', displaying an error message "An error occurred while calculating tax."**
> 
>To recreate the defect, we began by loading the Tax Calculator application using the provided link (http://24.199.68.169:3000/). Then, in the input field, we entered an income amount of $12345 and proceeded to press the "Calculate Tax" button. Our expected outcome was the display of a summary report showing the correct total tax to be paid, which should have been "$1,470.05".
<br/>
<br/>
However, the actual result differed from our expectations. Instead of the anticipated summary report, an error message appeared on the screen, stating: "An error occurred while calculating tax." This discrepancy between the expected and actual results highlighted a defect in the application's functionality. Our aim in employing this structured reporting approach was to ensure clear communication and documentation of each defect encountered, facilitating effective collaboration and resolution within the development process.
<br/>
<br/>
![Defect Report](/Assets/Defect%20reporting.png)

<!-- ----------------------------------------------------------------------------------------------------------------- -->
# TEST EXIT REPORT
At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.



![test exit report ](/Assets/screencapture-mail-google-mail-u-0-2023-08-15-02_06_08.png)
![mtk](https://img.shields.io/badge/Tax_Calculator-Mithila_Kuda-orange)

