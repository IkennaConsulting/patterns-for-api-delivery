# API Conformance Controls - Conformance tests


## Why ?

- API reference document can become inconsistent with the actual API implementation.

- 52% of the respondents to the 2023 Smartbear State of Software Quality | API report
  sited documentation being out of sync as the 2nd largest hindrance to API documentation

-  "It ain’t what you don't know that gets you into trouble. It's what you know for sure that just ain't so." – Mark Twain
![Mark Twain](mark-twain.png)


## The solution
Run conformance (also called contract or compliance tests) to ensure API reference is in sync with implementation.
![Conformance control](./conformance.png)
## Types
- Code-based end-to-end schema test.
- Code-based controller schema test.
- Auto generated end-to-end schema test with a fuzzer.
- End-to-end schema testing with validating proxy.

## Benefits
- Reliable, trustworthy documentation 
- Better developer experience 
- More correct SDKs and other generated artifacts
- Lower support costs from defects

## How to do it - the code
- Wiretap
- Schemathesis - fuzz testing

## What to look out for when doing conformance testing
- Run on PR changes (lightweight)
- Avoid running full suite on every build (expensive)
- Multiple controls helpful - testing conformance + generating code from specs 

## Challenges
- Conformance testing is expensive to run end-to-end as part of regular test suite.

## Contraindications
- Code-first development
- Good server stub code generation minimizes the need for conformance tests

## Alternatives
- Generate code from specs (API design-first)
- Generate spec from code (code-first)
- Internal APIs - consumer-driven contract testing (but not for public / external APIs)
