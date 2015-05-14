package org.mutabilitydetector.scalaclient

import org.junit.runner.RunWith
import org.mutabilitydetector.unittesting.MutabilityAssert
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import org.mutabilitydetector.unittesting.MutabilityAssert._

@RunWith(classOf[JUnitRunner])
class ImmutabilityTests extends FunSuite with ShouldMatchers {

  test("final case class") {
    assertImmutable(classOf[FinalCaseClass])
  }

}
