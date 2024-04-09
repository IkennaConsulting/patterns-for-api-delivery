# Code Generation Controls

## Why?
- Ensure that your API definition can be used to generate SDKs if required
- Generate SDKs/Server stubs:
  - To improve the developer experience for API consumers: client SDKs
  - To reduce the chance of drift between the API definition and the implementation: server stubs (server boiler plate)

## The solution
- Use a code generation library to generate code from your API definition

## Benefits
- Lower cognitive load for API consumers 'SDK first experience'
- Save development time for API consumers and API producers
- Reduce drift

## How to do it - the code

## What to look out for when doing code generation
- Can use a code generation service?

## Challenges
- Poor quality API definitions
- Maintenance overhead. If multiple SDKs, cost of
  - addressing specific issues for each SDK
  - deployment pipeline, documentation for each
- Resource allocation
- Release management 
  - tracking SDK version and use by clients
  - testing SDKs to avoid breaking changes

## Contraindications
- No budget / resource to support more client SDKs

## Alternatives
 Client side: 
 - Client coded integration
 - Provider hand coded SDKs
Server side
 - Provider hand coded schema objects and controllers