package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.test.FakeRequest

class WelcomeControllerSpec extends PlaySpec with GuiceOneAppPerSuite{
  "WelcomeController GET" should {
    "return a successful response" in {
      val controller = new WelcomeControllerSpec
      val result = controller.welcome.apply(FakeRequest())
      status(result) mustBe OK
    }
  }
}
