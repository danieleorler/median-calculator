[![Build Status](https://travis-ci.org/danieleorler/median-calculator.svg?branch=master)](https://travis-ci.org/danieleorler/median-calculator)
[![Coverage Status](https://coveralls.io/repos/github/danieleorler/median-calculator/badge.svg?branch=master)](https://coveralls.io/github/danieleorler/median-calculator?branch=master)
# median-calculator

## Description
median-calculator computes the median of a given list of `Integer` samples.   

The class `RollingMedianCalculator` is responsible for ingesting samples (one at a time) and computing the final median.
Samples are stored into an instance of `Histogram` which keeps track of the samples' frequencies.

Once the input has finished streaming in, `RollingMedianCalculator` goes through the histogram and computes the median.

## Assumptions
* As of now the algorithm doesn't support even numbers of samples, it will try anyway but it will also warn you.
* a sample ranges from 0 to 1000
* the streaming logic is left to the developer, the class `App.java` implements streaming from the `stdin`

## Requirements
* java 8
* maven 3

## Build
`mvn install`

## Run

`java -jar target/median.jar` will listen to the stdin, type a list of samples (i.e 1,2,3,4,5). The application closes the stdin stream and returns once it receives an empty line.

`java -jar target/median.jar < examples/example_6` ~ 100 samples   
`java -jar target/median.jar < examples/example_7` ~ 1000 samples   
`java -jar target/median.jar < examples/example_big` ~ 10^6 samples   
