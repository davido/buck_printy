Buck example project for JUnit assumption violation integration
===============================================================

Install [Buck](https://buckbuild.com/setup/getting_started.html) and run:

```
  buck test :printy_tests
FAILURE org.gerritcon.mv2016.PrintyTest test_failed: expected:<[foo]> but was:<[bar]>
[-] PROCESSING BUCK FILES...FINISHED 0.0s 🏖  (Watchman reported no changes)
[-] DOWNLOADING... (0.00 B/S AVG, TOTAL: 0.00 B, 0 Artifacts)
[-] BUILDING...FINISHED 0.0s [100%] (6/6 JOBS, 0 UPDATED, 0 [0.0%] CACHE MISS)
[-] TESTING...FINISHED 0.0s (1 PASS/1 SKIP/1 FAIL)
RESULTS FOR //:printy_tests
FAIL    CACHED  1 Passed   1 Skipped   1 Failed   org.gerritcon.mv2016.PrintyTest
FAILURE org.gerritcon.mv2016.PrintyTest test_failed: expected:<[foo]> but was:<[bar]>
org.junit.ComparisonFailure: expected:<[foo]> but was:<[bar]>
	at org.junit.Assert.assertEquals(Assert.java:115)
[...]
	at java.lang.Thread.run(Thread.java:748)

TESTS FAILED: 1 FAILURE
Failed target: //:printy_tests
FAIL org.gerritcon.mv2016.PrintyTest
```

and notice this line:

```
FAIL    CACHED  1 Passed   1 Skipped   1 Failed   org.gerritcon.mv2016.PrintyTest
```
