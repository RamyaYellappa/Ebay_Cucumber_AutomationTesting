## Overview
This project focuses on the Ebay Application with the following objectives:
1. Access a Product via category after applying multiple filters.
2. Access a Product via Search.

## Setup and Execution
I utilized the Cucumber framework to execute these scenarios:

1. **Feature Files:** Added feature files written in Gherkin language (located in src/test/resources).
   - For scenario 1, run "TestScenario1.feature" as a Cucumber feature file.
   - For scenario 2, run "TestScenario2.feature" as a Cucumber feature file.

2. **Junit Integration:**
   - Created a "Runner class" under StepDefinition for Junit execution.
   - Supports parallel execution.
   - Added plugins to generate reports in XML, JSON, and HTML formats (check under the "target" folder for reports).
   - Before executing the script, update the Features path in the Runner class.

### Prerequisites
Ensure you have the following prerequisites installed:
- Eclipse
- Cucumber plugin
- Java
