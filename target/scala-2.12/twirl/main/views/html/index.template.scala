
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.120*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*38.10*/for(p<-products) yield /*38.26*/ {_display_(Seq[Any](format.raw/*38.28*/("""
          """),format.raw/*39.11*/("""<tr>
              """),_display_(/*40.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*40.104*/ {_display_(Seq[Any](format.raw/*40.106*/("""
                """),format.raw/*41.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*41.72*/(p.getId + ".jpg")),format.raw/*41.90*/(""""/></td>
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
                """),format.raw/*43.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""<td class="numeric">"""),_display_(/*45.34*/p/*45.35*/.getId),format.raw/*45.41*/("""</td>
            <td><a href=""""),_display_(/*46.27*/routes/*46.33*/.HomeController.productDetails(p.getId)),format.raw/*46.72*/("""">
                """),_display_(/*47.18*/p/*47.19*/.getName),format.raw/*47.27*/("""</td>
               </a>     
            <td>"""),_display_(/*49.18*/p/*49.19*/.getDescription),format.raw/*49.34*/("""</td>
            <td  class="numeric">"""),_display_(/*50.35*/p/*50.36*/.getStock),format.raw/*50.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*51.37*/("%.2f".format(p.getPrice))),format.raw/*51.64*/("""</td>
            <td>
              <a href=""""),_display_(/*53.25*/routes/*53.31*/.HomeController.updateProduct(p.getId)),format.raw/*53.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*57.25*/routes/*57.31*/.HomeController.deleteProduct(p.getId)),format.raw/*57.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*62.10*/("""
      """),format.raw/*63.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*68.17*/routes/*68.23*/.HomeController.addProduct()),format.raw/*68.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*74.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 10:52:01 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/index.scala.html
                  HASH: 0f4a2af299d075a03139caab8898b43f6dbf99ff
                  MATRIX: 1023->1|1237->119|1265->122|1294->143|1333->145|1361->147|1543->302|1558->308|1603->332|1681->384|1717->404|1757->406|1793->415|1830->425|1845->431|1896->461|1950->488|1960->489|1989->497|2028->508|2076->529|2086->530|2126->549|2184->577|2216->582|2360->700|2401->732|2441->734|2477->743|2549->788|2563->793|2599->808|2635->817|2679->831|2713->838|2979->1077|3011->1093|3051->1095|3090->1106|3137->1126|3235->1214|3276->1216|3321->1233|3403->1288|3442->1306|3483->1329|3496->1334|3535->1335|3580->1352|3698->1439|3739->1452|3787->1473|3797->1474|3824->1480|3883->1512|3898->1518|3958->1557|4005->1577|4015->1578|4044->1586|4119->1634|4129->1635|4165->1650|4232->1690|4242->1691|4272->1700|4341->1742|4389->1769|4463->1816|4478->1822|4537->1860|4734->2030|4749->2036|4808->2074|5028->2263|5062->2270|5137->2318|5152->2324|5201->2352|5334->2455
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|85->53|85->53|85->53|89->57|89->57|89->57|94->62|95->63|100->68|100->68|100->68|106->74
                  -- GENERATED --
              */
          