import org.specs2.mutable.Specification

class Spinny extends Specification {

  "This is a specification for Spinny" >> {

    "True" >> {
      "should always be True" >> {
        true must beTrue
      }
    }
  }
}
