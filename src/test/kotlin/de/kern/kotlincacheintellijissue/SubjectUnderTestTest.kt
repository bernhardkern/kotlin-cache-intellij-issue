package de.kern.kotlincacheintellijissue

import de.kern.kotlincacheintellijissue.TestConstants.Companion.TEST_STRING_IN_COMPANION_OBJECT_OF_CLASS
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class SubjectUnderTestTest {

    private val sut = SubjectUnderTest()

    /*
     * To reproduce the issue:
     * 1. run the test using IntelliJ (not gradle)
     * 2. change the value of TEST_STRING_IN_COMPANION_OBJECT_OF_CLASS to test2
     * 3. rerun the test
     * -> test stays green
     * -> expected: test fails
     * -> delete the out folder in Project Tool Window, and the test will work
     */
    @Test
    fun returnTestStringShouldMatchTestStringInCompanionObjectOfClass() {
        sut.returnTestString() shouldBe TEST_STRING_IN_COMPANION_OBJECT_OF_CLASS
    }

    /*
     * similar setup, but after changing the value of TEST_STRING_TOP_LEVEL the test will fail as expected
     */
    @Test
    fun returnTestStringShouldMatchTestStringTopLevel() {
        sut.returnTestString() shouldBe TEST_STRING_TOP_LEVEL
    }
}