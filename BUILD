java_test(
    name = "printy_tests",
    srcs = ["src/test/java/org/gerritcon/mv2016/PrintyTest.java"],
    deps = [":junit"],
)

prebuilt_jar(
    name = "junit",
    binary_jar = ":junit-jar",
    deps = [":hamcrest-core"],
)

remote_file(
    name = "junit-jar",
    out = "junit-4.12.jar",
    sha1 = "2973d150c0dc1fefe998f834810d68f278ea58ec",
    url = "mvn:junit:junit:jar:4.12",
)

prebuilt_jar(
    name = "hamcrest-core",
    binary_jar = ":hamcrest-core-jar",
)

remote_file(
    name = "hamcrest-core-jar",
    out = "hamcrest-core-1.3.jar",
    sha1 = "42a25dc3219429f0e5d060061f71acb49bf010a0",
    url = "mvn:org.hamcrest:hamcrest-core:jar:1.3",
)
