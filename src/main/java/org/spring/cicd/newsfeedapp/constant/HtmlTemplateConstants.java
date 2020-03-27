package org.spring.cicd.newsfeedapp.constant;

public class HtmlTemplateConstants {

	public static final String NEWS_TEMPLATE = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<script src=\"https://unpkg.com/react@16/umd/react.production.min.js\"></script>\r\n" + 
			"<script src=\"https://unpkg.com/react-dom@16/umd/react-dom.production.min.js\"></script>\r\n" + 
			"<script src=\"https://unpkg.com/babel-standalone@6.15.0/babel.min.js\"></script>\r\n"+
			"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js\"></script>\r\n"+
			"<style>\r\n" + 
			"html,\r\n" + 
			"body {\r\n" + 
			"  height: 100%;\r\n" + 
			"  width: 100%;\r\n" + 
			"  margin: 0;\r\n" + 
			"  font-family: -apple-system, system-ui, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Fira Sans, Ubuntu, Oxygen, Oxygen Sans, Cantarell;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".flex {\r\n" + 
			"  display: flex;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".flexColumn {\r\n" + 
			"  display: flex;\r\n" + 
			"  flex-direction: column;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".hover:hover {\r\n" + 
			"  cursor: pointer;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"a {\r\n" + 
			"  text-decoration: none;\r\n" + 
			"  color: black;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"#container {\r\n" + 
			"  width: 100%;\r\n" + 
			"  height: 100%;\r\n" + 
			"  display: flex;\r\n" + 
			"  flex-direction: column;\r\n" + 
			"  max-width: 1000px;\r\n" + 
			"  background: #fff;\r\n" + 
			"  margin: 0px auto;\r\n" + 
			"  text-align: center;\r\n" + 
			"}\r\n" + 
			"#container header {\r\n" + 
			"  font-size: 32px;\r\n" + 
			"  margin-top: 25px;\r\n" + 
			"}\r\n" + 
			"#container .date {\r\n" + 
			"  font-size: 20px;\r\n" + 
			"  font-weight: 600;\r\n" + 
			"  margin-bottom: 0;\r\n" + 
			"}\r\n" + 
			"#container .needToKnow {\r\n" + 
			"  font-size: 13px;\r\n" + 
			"  margin-top: 2px;\r\n" + 
			"  margin-bottom: 30px;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".postContainer {\r\n" + 
			"  width: 900px;\r\n" + 
			"  height: 240px;\r\n" + 
			"  background: #f3f6f8;\r\n" + 
			"  border-radius: 10px;\r\n" + 
			"  padding: 8px 16px;\r\n" + 
			"  margin: 0 auto;\r\n" + 
			"  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n" + 
			"  display: flex;\r\n" + 
			"  position: relative;\r\n" + 
			"  text-align: left;\r\n" + 
			"  margin-bottom: 40px;\r\n" + 
			"  transition-duration: .5s;\r\n" + 
			"}\r\n" + 
			".postContainer .mainImage {\r\n" + 
			"  width: 320px;\r\n" + 
			"  height: 256px;\r\n" + 
			"  background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);\r\n" + 
			"  margin: 0;\r\n" + 
			"  top: -8px;\r\n" + 
			"  left: -16px;\r\n" + 
			"  border-bottom-left-radius: 10px;\r\n" + 
			"  border-top-left-radius: 10px;\r\n" + 
			"  padding: 0;\r\n" + 
			"  position: relative;\r\n" + 
			"  z-index: 5;\r\n" + 
			"  overflow: hidden;\r\n" + 
			"}\r\n" + 
			".postContainer .mainImage .image {\r\n" + 
			"  object-fit: cover;\r\n" + 
			"  height: 260px;\r\n" + 
			"  width: 320px;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".postContainer:hover {\r\n" + 
			"  transform: translateY(-5px);\r\n" + 
			"  box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".detailContainer {\r\n" + 
			"  width: 580px;\r\n" + 
			"}\r\n" + 
			".detailContainer .detailTopLeft {\r\n" + 
			"  width: 85%;\r\n" + 
			"}\r\n" + 
			".detailContainer .detailTopRight {\r\n" + 
			"  width: 10%;\r\n" + 
			"  background: transparent;\r\n" + 
			"  float: right;\r\n" + 
			"}\r\n" + 
			".detailContainer .detailTopRight button {\r\n" + 
			"  height: 35px;\r\n" + 
			"  width: 90px;\r\n" + 
			"  font-size: 16px;\r\n" + 
			"  font-weight: 500;\r\n" + 
			"  border-radius: 2px;\r\n" + 
			"  background: transparent;\r\n" + 
			"  color: rgba(0, 0, 0, 0.6);\r\n" + 
			"  border: 1px solid rgba(0, 0, 0, 0.6);\r\n" + 
			"  transition: all 300ms ease-in-out;\r\n" + 
			"  transition-timing-function: ease-in-out;\r\n" + 
			"}\r\n" + 
			".detailContainer .detailTopRight button:hover {\r\n" + 
			"  color: rgba(0, 0, 0, 0.9);\r\n" + 
			"  border: 2px solid rgba(0, 0, 0, 0.9);\r\n" + 
			"  background: rgba(0, 0, 0, 0.1);\r\n" + 
			"  cursor: pointer;\r\n" + 
			"}\r\n" + 
			".detailContainer .title {\r\n" + 
			"  font-size: 20px;\r\n" + 
			"  font-weight: 600;\r\n" + 
			"  margin: 0;\r\n" + 
			"  text-overflow: ellipsis;\r\n" + 
			"}\r\n" + 
			".detailContainer .author {\r\n" + 
			"  font-size: 14px;\r\n" + 
			"  margin: 1px 0px;\r\n" + 
			"  color: rgba(0, 0, 0, 0.5);\r\n" + 
			"}\r\n" + 
			".detailContainer .detail {\r\n" + 
			"  font-size: 14px;\r\n" + 
			"  line-height: 20px;\r\n" + 
			"  text-overflow: ellipsis;\r\n" + 
			"  height: 35px;\r\n" + 
			"  overflow: hidden;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".editorPickContainer {\r\n" + 
			"  height: 90px;\r\n" + 
			"  border-radius: 10px;\r\n" + 
			"  border: 1px solid rgba(0, 0, 0, 0.1);\r\n" + 
			"  padding: 8px 16px;\r\n" + 
			"  background-color: #fff;\r\n" + 
			"}\r\n" + 
			".editorPickContainer .editorsPick {\r\n" + 
			"  font-size: 14px;\r\n" + 
			"  color: rgba(0, 0, 0, 0.5);\r\n" + 
			"}\r\n" + 
			".editorPickContainer .imageContainer {\r\n" + 
			"  width: 25px;\r\n" + 
			"  margin: 4px;\r\n" + 
			"}\r\n" + 
			".editorPickContainer .editorsPickDetail {\r\n" + 
			"  font-size: 14px;\r\n" + 
			"  line-height: 20px;\r\n" + 
			"  margin: 4px 5px;\r\n" + 
			"  overflow: hidden;\r\n" + 
			"  height: 40px;\r\n" + 
			"}\r\n" + 
			".editorPickContainer .seeMore {\r\n" + 
			"  color: #3d94c4;\r\n" + 
			"  font-size: 14px;\r\n" + 
			"  font-weight: 600;\r\n" + 
			"  margin: 4px 5px;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".authorImage {\r\n" + 
			"  height: 25px;\r\n" + 
			"  width: 25px;\r\n" + 
			"  border-radius: 50%;\r\n" + 
			"}\r\n"+
			"</style>\r\n" + 
			
			"</head>\r\n" + 
			"\r\n" + 
			"<body>\r\n" + 
			"\r\n" + 
			"<div id=\"root\"><div>" + 
			"\r\n" +
			"<script type=\"text/babel\">\r\n" +
			"const generateRandomUserImage = () => {\r\n" + 
			"  let random = Math.floor(Math.random() * 70);\r\n" + 
			"  let gender = ['men', 'women'][Math.floor(Math.random() * 2)];\r\n" + 
			"  return `https://randomuser.me/api/portraits/${gender}/${random}.jpg`;\r\n" + 
			"};\r\n" + 
			"\r\n" + 
			"const PostContainer = props => {\r\n" + 
			"  const { authorImage, content, description, urlToImage, detail, title, author, source, url, editorsPick } = props.metaData;\r\n" + 
			"  return (\r\n" + 
			"    React.createElement(\"div\", { className: \"postContainer\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"mainImage\" },\r\n" + 
			"    React.createElement(\"img\", { className: \"image\", src: urlToImage })),\r\n" + 
			"\r\n" + 
			"    React.createElement(\"div\", { className: \"detailContainer\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"flex\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"detailTopLeft\" },\r\n" + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }, React.createElement(\"p\", { className: \"title hover\" }, title && title.slice(0, 93))),\r\n" + 
			"    React.createElement(\"p\", { className: \"author\" }, \"By \", author && author.slice(0, 30), \", Editor at \", source && source.name)),\r\n" + 
			"\r\n" + 
			"    React.createElement(\"div\", { className: \"detailTopRight\" },\r\n" + 
			"    React.createElement(\"button\", null, \"Share\"))),\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" },\r\n" + 
			"    React.createElement(\"p\", { className: \"detail hover\" }, description && description.slice(0, 165), \"...\")),\r\n" + 
			"    React.createElement(\"div\", { className: \"editorPickContainer hover\" },\r\n" + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"editorsPick\" }, \"Editors' Pick\"),\r\n" + 
			"    React.createElement(\"div\", { className: \"flex\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"imageContainer\" },\r\n" + 
			"    React.createElement(\"img\", { className: \"authorImage\", src: authorImage || generateRandomUserImage() })),\r\n" + 
			"\r\n" + 
			"    React.createElement(\"div\", { className: \"flexColumn\" },\r\n" + 
			"    React.createElement(\"div\", { className: \"editorsPickDetail\" }, content && content.slice(0, 140), \"...\"),\r\n" + 
			"    React.createElement(\"div\", { className: \"seeMore\" }, \"See what people are saying -> \"))))))));\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"};\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"const App = () => {\r\n" + 
			"  const [articles, setArticles] = React.useState([]);\r\n" + 
			"  React.useEffect(() => {\r\n" + 
			"    fetch('https://newsapi.org/v2/top-headlines?country=in&apiKey=d88837678f904443affbc28f7ee13ce1').then(data => {\r\n" + 
			"      const jsonData = data.json();\r\n" + 
			"      return jsonData;\r\n" + 
			"    }).then(results => {\r\n" + 
			"      const articles = results.articles;\r\n" + 
			"      console.log(articles[0]);\r\n" + 
			"      setArticles(articles);\r\n" + 
			"    });\r\n" + 
			"  }, []);\r\n" + 
			"  return (\r\n" + 
			"    React.createElement(\"div\", { id: \"container\" },\r\n" + 
			"    React.createElement(\"header\", null, \"Daily Rundown\"),\r\n" + 
			"    React.createElement(\"p\", { className: \"date\" }, moment(Date.now()).format('dddd, MMMM D')),\r\n" + 
			"    React.createElement(\"p\", { className: \"needToKnow\" }, React.createElement(\"a\", { href: \"https://in.linkedin.com/in/sukanta-banerjee-6ab375100\", target: \"_blank\" }, \"Sukanta\"), \", here's what you need to know today\"),\r\n" + 
			"    React.createElement(\"main\", null,\r\n" + 
			"    articles.map(post => React.createElement(PostContainer, { metaData: post, key: post.title }))),\r\n" + 
			"\r\n" + 
			"    React.createElement(\"div\", { className: \"bottom\" },\r\n" + 
			"    React.createElement(\"p\", null, \"You\\u2019re all caught up on today\\u2019s top news\"),\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"    React.createElement(\"p\", null, \"Have a great day\"))));\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"};\r\n" + 
			"ReactDOM.render(React.createElement(App, null), document.getElementById('root'));" + 
			"</script>\r\n" +
			"</body>\r\n" + 
			
			"</html>";
	
}
