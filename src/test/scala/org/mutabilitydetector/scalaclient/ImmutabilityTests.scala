package org.mutabilitydetector.scalaclient

import org.scalatest._
import matchers.ShouldMatchers
import org.mutabilitydetector.unittesting.MutabilityAssert

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class ImmutabilityTests extends FunSuite with ShouldMatchers {

  test("be immutable") {
    MutabilityAssert.assertImmutable(classOf[SomeCaseClass])
  }
}
