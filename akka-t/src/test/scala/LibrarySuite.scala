/*
 * This Scala Testsuite was auto generated by running 'gradle init --type scala-library'
 * by 'yun_dev1' at '16. 3. 18 오후 6:34' with Gradle 2.8
 *
 * @author yun_dev1, @date 16. 3. 18 오후 6:34
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LibrarySuite extends FunSuite {
  test("someLibraryMethod is always true") {
    def library = new Library()
    assert(library.someLibraryMethod)
  }
}
