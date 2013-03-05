package org.mutabilitydetector.scalaclient

import org.junit.runner.RunWith
import org.mutabilitydetector.unittesting.MutabilityAssert
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import org.mutabilitydetector.unittesting.MutabilityAssert._

@RunWith(classOf[JUnitRunner])
class ImmutabilityTests extends FunSuite with ShouldMatchers {

  test("non final case class") {
    assertImmutable(classOf[CaseClass])
  }

  test("final case class") {
    assertImmutable(classOf[FinalCaseClass])
  }

  test("final immutable class") {
    assertImmutable(classOf[ImmutableClass])
  }
  
  test("final mutable class with reassignable fields") {
    assertImmutable(classOf[ReassignableFields])
  }
  
  test("final immutable class with immutable list field") {
    assertImmutable(classOf[ImmutableWithListField])
  }
  
  test("scala.collection.immutable.List - abstract") {
    assertImmutable(classOf[scala.collection.immutable.List[_]])
  }
}
