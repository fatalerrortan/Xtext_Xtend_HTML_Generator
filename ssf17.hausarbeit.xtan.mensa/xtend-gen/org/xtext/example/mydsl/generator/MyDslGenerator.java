/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Button;
import org.xtext.example.mydsl.myDsl.Checkbox;
import org.xtext.example.mydsl.myDsl.Description;
import org.xtext.example.mydsl.myDsl.Footer;
import org.xtext.example.mydsl.myDsl.Header;
import org.xtext.example.mydsl.myDsl.Link;
import org.xtext.example.mydsl.myDsl.Menu;
import org.xtext.example.mydsl.myDsl.NAV;
import org.xtext.example.mydsl.myDsl.Radio;
import org.xtext.example.mydsl.myDsl.Selector;
import org.xtext.example.mydsl.myDsl.Sidebar;

/**
 * Generates code from your model files on save.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  private File varImgDir = new File("imgs");
  
  private boolean exists = this.varImgDir.exists();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"navbar-header\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<span class=\"sr-only\">Toggle navigation</span>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<a class=\"navbar-brand\" href=\"#\">Mensa</a>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">");
    _builder.newLine();
    {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Header> _filter = Iterables.<Header>filter(_iterable, Header.class);
      for(final Header header_html : _filter) {
        _builder.append("               \t\t\t\t");
        _builder.append("<h1 style=\"color: blue\">");
        Description _description = header_html.getDescription();
        String _name = _description.getName();
        _builder.append(_name, "               \t\t\t\t");
        _builder.append("</h1>");
        _builder.newLineIfNotEmpty();
        _builder.append("   \t\t\t          \t\t\t                ");
        _builder.append("<ul class=\"nav navbar-nav\">   \t\t\t                   \t\t\t\t\t");
        _builder.newLine();
        {
          EList<NAV> _nav = header_html.getNav();
          for(final NAV nav : _nav) {
            _builder.append("               \t\t\t\t");
            _builder.append("<li>");
            _builder.newLine();
            _builder.append("               \t\t\t\t");
            _builder.append("\t");
            _builder.append("<a href=\"");
            String _href = nav.getHref();
            _builder.append(_href, "               \t\t\t\t\t");
            _builder.append("\">");
            Description _description_1 = nav.getDescription();
            String _name_1 = _description_1.getName();
            _builder.append(_name_1, "               \t\t\t\t\t");
            _builder.append("</a>");
            _builder.newLineIfNotEmpty();
            _builder.append("               \t\t\t\t");
            _builder.append("</li>\t");
            _builder.newLine();
          }
        }
        _builder.append("               \t\t\t\t");
        _builder.append("</ul>\t");
        _builder.newLine();
      }
    }
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</nav>  ");
    _builder.newLine();
    final String header_html_1 = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<div class=\"col-md-4\">");
    _builder_1.newLine();
    {
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<Sidebar> _filter_1 = Iterables.<Sidebar>filter(_iterable_1, Sidebar.class);
      for(final Sidebar sidebar_html : _filter_1) {
        _builder_1.append("\t\t\t\t                ");
        _builder_1.append("<div class=\"well\">\t\t\t\t                 ");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t                     \t");
        _builder_1.append("<h4>");
        Description _description_2 = sidebar_html.getDescription();
        String _name_2 = _description_2.getName();
        _builder_1.append(_name_2, "\t\t\t\t                     \t");
        _builder_1.append("</h4>");
        _builder_1.newLineIfNotEmpty();
        {
          EList<Selector> _selector = sidebar_html.getSelector();
          for(final Selector tool : _selector) {
            _builder_1.append("\t\t\t\t                     \t ");
            _builder_1.append("<div class=\"mensa_select\">");
            _builder_1.newLine();
            _builder_1.append("\t\t\t\t                     \t ");
            _builder_1.append("\t");
            _builder_1.append("<h5>");
            Description _title = tool.getTitle();
            String _name_3 = _title.getName();
            _builder_1.append(_name_3, "\t\t\t\t                     \t \t");
            _builder_1.append("</h5>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t\t\t                     \t ");
            _builder_1.append("\t");
            _builder_1.append("<select>");
            _builder_1.newLine();
            {
              EList<String> _options = tool.getOptions();
              for(final String option : _options) {
                _builder_1.append("\t\t\t\t                     \t ");
                _builder_1.append("\t\t");
                _builder_1.append("<option value=\"");
                _builder_1.append(option, "\t\t\t\t                     \t \t\t");
                _builder_1.append("\">");
                _builder_1.append(option, "\t\t\t\t                     \t \t\t");
                _builder_1.append("</option>");
                _builder_1.newLineIfNotEmpty();
              }
            }
            _builder_1.append("\t\t\t\t                     \t ");
            _builder_1.append("\t");
            _builder_1.append("</select>");
            _builder_1.newLine();
            _builder_1.append("\t\t\t\t                     \t ");
            _builder_1.append("</div>");
            _builder_1.newLine();
          }
        }
        {
          EList<Radio> _radio = sidebar_html.getRadio();
          for(final Radio tool_1 : _radio) {
            _builder_1.append("<div class=\"mensa_raido\">");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("<h5>");
            Description _title_1 = tool_1.getTitle();
            String _name_4 = _title_1.getName();
            _builder_1.append(_name_4, "\t");
            _builder_1.append("</h5>\t\t\t\t\t\t\t\t");
            _builder_1.newLineIfNotEmpty();
            {
              EList<String> _options_1 = tool_1.getOptions();
              for(final String option_1 : _options_1) {
                _builder_1.append("\t\t\t");
                _builder_1.append("<label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">");
                _builder_1.newLine();
                _builder_1.append("\t\t\t");
                _builder_1.append("\t");
                _builder_1.append(option_1, "\t\t\t\t");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t\t\t");
                _builder_1.append("</label>");
                _builder_1.newLine();
              }
            }
            _builder_1.append("\t");
            _builder_1.append("</div>");
            _builder_1.newLine();
          }
        }
        {
          EList<Checkbox> _checkbox = sidebar_html.getCheckbox();
          for(final Checkbox tool_2 : _checkbox) {
            _builder_1.append("<div class=\"mensa_checkbox\">");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("<h5>");
            Description _title_2 = tool_2.getTitle();
            String _name_5 = _title_2.getName();
            _builder_1.append(_name_5, "\t");
            _builder_1.append("</h5>\t\t\t\t\t\t\t\t");
            _builder_1.newLineIfNotEmpty();
            {
              EList<String> _options_2 = tool_2.getOptions();
              for(final String option_2 : _options_2) {
                _builder_1.append("\t\t\t");
                _builder_1.append("<label class=\"checkbox-inline\"><input type=\"checkbox\" value=\"\">");
                _builder_1.newLine();
                _builder_1.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t  ");
                _builder_1.append(option_2, "\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t  ");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t");
                _builder_1.append("</label>");
                _builder_1.newLine();
              }
            }
            _builder_1.append("\t");
            _builder_1.append("</div>");
            _builder_1.newLine();
          }
        }
        {
          EList<Button> _button = sidebar_html.getButton();
          for(final Button tool_3 : _button) {
            _builder_1.append("<div class=\'mensa_button\'>");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("<a href=\"");
            String _href_1 = tool_3.getHref();
            _builder_1.append(_href_1, "\t");
            _builder_1.append("\"><button type=\"button\" class=\"btn btn-info\">");
            Description _title_3 = tool_3.getTitle();
            String _name_6 = _title_3.getName();
            _builder_1.append(_name_6, "\t");
            _builder_1.append("</button></a>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("</div>");
            _builder_1.newLine();
          }
        }
        _builder_1.append("\t\t\t\t          ");
        _builder_1.append("</div>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t                  \t\t");
        _builder_1.append("<br />");
        _builder_1.newLine();
      }
    }
    _builder_1.append("     ");
    _builder_1.append("</div>");
    _builder_1.newLine();
    final String sidebar_html_1 = _builder_1.toString();
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("<footer>");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("<div class=\"col-md-2 placeholder\"></div>");
    _builder_2.newLine();
    {
      TreeIterator<EObject> _allContents_2 = resource.getAllContents();
      Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
      Iterable<Footer> _filter_2 = Iterables.<Footer>filter(_iterable_2, Footer.class);
      for(final Footer footer_html : _filter_2) {
        _builder_2.append("            ");
        _builder_2.append("<div class=\"col-md-2\">");
        _builder_2.newLine();
        _builder_2.append("            ");
        _builder_2.append("   \t");
        _builder_2.append("<h4>");
        Description _description_3 = footer_html.getDescription();
        String _name_7 = _description_3.getName();
        _builder_2.append(_name_7, "               \t");
        _builder_2.append("</h4>");
        _builder_2.newLineIfNotEmpty();
        {
          EList<Link> _links = footer_html.getLinks();
          for(final Link link : _links) {
            _builder_2.append("            ");
            _builder_2.append(" \t");
            _builder_2.append("<p><a href=\"");
            String _url = link.getUrl();
            _builder_2.append(_url, "             \t");
            _builder_2.append("\">");
            Description _description_4 = link.getDescription();
            String _name_8 = _description_4.getName();
            _builder_2.append(_name_8, "             \t");
            _builder_2.append("</a></p>");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("            ");
        _builder_2.append(" ");
        _builder_2.append("</div> \t");
        _builder_2.newLine();
      }
    }
    _builder_2.append("</footer>");
    _builder_2.newLine();
    final String footer_html_1 = _builder_2.toString();
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<div class=\"col-md-8\">");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("<div class=\"well\">");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<h1>Speiseplan</h1>");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("<ul>");
    _builder_3.newLine();
    {
      TreeIterator<EObject> _allContents_3 = resource.getAllContents();
      Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
      Iterable<Menu> _filter_3 = Iterables.<Menu>filter(_iterable_3, Menu.class);
      for(final Menu menu_html : _filter_3) {
        _builder_3.append("\t\t");
        _builder_3.append("<li>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<h3>");
        String _meal = menu_html.getMeal();
        _builder_3.append(_meal, "\t\t\t");
        _builder_3.append("</h3>");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("<div class=\"row\">");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t");
        _builder_3.append("<div class=\"col-md-3\">");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t\t");
        _builder_3.append("<img src=\"./imgs/");
        String _image = menu_html.getImage();
        _builder_3.append(_image, "\t\t\t\t\t");
        _builder_3.append("\" alt=\"");
        String _meal_1 = menu_html.getMeal();
        _builder_3.append(_meal_1, "\t\t\t\t\t");
        _builder_3.append("\" width=\"180px\" height=\"180px\" />");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t\t");
        _builder_3.append("<h5>");
        String _price = menu_html.getPrice();
        _builder_3.append(_price, "\t\t\t\t\t");
        _builder_3.append(" €</h5>");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t");
        _builder_3.append("</div>");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t");
        _builder_3.append("<div class=\"col-md-9\">");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t\t");
        _builder_3.append("<span style=\"border: 1px solid #4285F4;\">");
        Description _description_5 = menu_html.getDescription();
        String _name_9 = _description_5.getName();
        _builder_3.append(_name_9, "\t\t\t\t\t");
        _builder_3.append("</span>");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t\t");
        _builder_3.append("\t\t");
        _builder_3.append("</div>\t");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("\t");
        _builder_3.append("</div>\t");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("</li>");
        _builder_3.newLine();
      }
    }
    _builder_3.append("\t\t  ");
    _builder_3.append("</ul>");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("</div>");
    _builder_3.newLine();
    _builder_3.append("</div>");
    _builder_3.newLine();
    _builder_3.append("<hr />");
    _builder_3.newLine();
    final String menus_html = _builder_3.toString();
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("<!DOCTYPE html>");
    _builder_4.newLine();
    _builder_4.append("<html>");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("<head>");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<head>");
    _builder_4.newLine();
    _builder_4.append("\t\t    ");
    _builder_4.append("<meta charset=\"utf-8\">");
    _builder_4.newLine();
    _builder_4.append("\t\t    ");
    _builder_4.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder_4.newLine();
    _builder_4.append("\t\t    ");
    _builder_4.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder_4.newLine();
    _builder_4.append("\t\t    ");
    _builder_4.append("<title>Mensa Speiseplan</title>");
    _builder_4.newLine();
    _builder_4.append("\t\t    ");
    _builder_4.append("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("</head>");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("</head>");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("<body>");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<div class=\"row\">");
    _builder_4.newLine();
    _builder_4.append("\t\t\t");
    _builder_4.append(header_html_1, "\t\t\t");
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("\t\t");
    _builder_4.append("</div>\t");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<br /><br /><br /><br /><br /><br /><br />");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<div class=\"row\">");
    _builder_4.newLine();
    _builder_4.append("\t\t\t");
    _builder_4.append(menus_html, "\t\t\t");
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("\t\t\t");
    _builder_4.append(sidebar_html_1, "\t\t\t");
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("\t\t");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<div class=\"row\">");
    _builder_4.newLine();
    _builder_4.append("\t\t\t");
    _builder_4.append(footer_html_1, "\t\t\t");
    _builder_4.append("\t");
    _builder_4.newLineIfNotEmpty();
    _builder_4.append("\t\t");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("</body>");
    _builder_4.newLine();
    _builder_4.append("</html>");
    _builder_4.newLine();
    final String html = _builder_4.toString();
    String _string = html.toString();
    fsa.generateFile("mensa_speiseplan.html", _string);
    if ((!this.exists)) {
      fsa.generateFile("imgs/readme.txt", "Please place mensa related images in this folder");
    }
  }
}
