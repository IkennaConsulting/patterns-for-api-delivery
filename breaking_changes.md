# Automated Breaking change Controls

## The problem
Breaking change: A change to an API that requires existing client integration code to change. 

**Real customer quote 1:**  "You should stop doing breaking changes to the api ASAP. If you do not, as a business, you will lose a massive amount of customers and lose reputation."

**Real customer quote 2:** "The way [company] handles API changes is going to impact our business since we consume the data in production. We are left without any solutions or guidelines. We found out a bit late about the breaking change that is going to happen tomorrow..."

Breaking changes can come from:
- a change in the API definition.
- a change in the code not reflected in the definition.

## Solution
- Have a clear versioning strategy and breaking change policy.
- Use breaking change tools to catch unintended breaking changes.
 ![Breaking Change Control](./breaking_change.png)
- Generate an API change log.

## Benefits
- Better API adoption 
- Reduce customer attrition
- Reduced support costs related to breaking changes. 
- Lower cognitive load regarding breaking changes 

## How to do it - the code
See the [code here](./.github/workflows/breaking-checks.yaml).
Code example for:
- Tufin/Oasdiff
- Optic
- Bump.sh

## Tips 
- Well-defined breaking change rules. https://github.com/Tufin/oasdiff/blob/main/BREAKING-CHANGES-EXAMPLES.md
- Should also generate OpenAPI change log. 
  - You can follow the format in https://keepachangelog.com/en/1.0.0/ 


## Challenges
- Absence of API providers breaking change policy
  - https://developer.sage.com/api/people/breaking-changes/
  - https://developers.hubspot.com/docs/breaking-change-definition
- Handling deprecations

## Contraindications
- Early part of product development

## Alternatives
- Detect changes in manual API design reviews
- For internal APIs - consumer-driven contract testing 