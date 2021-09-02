#!/usr/bin/env zsh
gradle wrapper --gradle-version=7.1.1 --distribution-type=all --warning-mode=all
./gradlew build test genIntellijRuns --warning-mode=all