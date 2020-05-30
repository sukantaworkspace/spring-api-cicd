package org.spring.cicd.newsfeedapp.constant;

public class HtmlTemplateConstants {
	
	//Listened to code coverage
	private HtmlTemplateConstants() {}
	
	//Repetition removed
	public static final String  delimiter = "\r\n";

	public static final String NEWS_TEMPLATE = "<!DOCTYPE html>" + delimiter + 
			"<html>" + delimiter + 
			"<head>" + delimiter + 
			"<script src=\"https://unpkg.com/react@16/umd/react.production.min.js\"></script>" + delimiter + 
			"<script src=\"https://unpkg.com/react-dom@16/umd/react-dom.production.min.js\"></script>" + delimiter + 
			"<script src=\"https://unpkg.com/babel-standalone@6.15.0/babel.min.js\"></script>" + delimiter+
			"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js\"></script>" + delimiter+
			"<style>" + delimiter + 
			"html," + delimiter + 
			"body {" + delimiter + 
			"  height: 100%;" + delimiter + 
			"  width: 100%;" + delimiter + 
			"  margin: 0;" + delimiter + 
			"  font-family: -apple-system, system-ui, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Fira Sans, Ubuntu, Oxygen, Oxygen Sans, Cantarell;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".flex {" + delimiter + 
			"  display: flex;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".flexColumn {" + delimiter + 
			"  display: flex;" + delimiter + 
			"  flex-direction: column;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".hover:hover {" + delimiter + 
			"  cursor: pointer;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			"a {" + delimiter + 
			"  text-decoration: none;" + delimiter + 
			"  color: black;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			"#container {" + delimiter + 
			"  width: 100%;" + delimiter + 
			"  height: 100%;" + delimiter + 
			"  display: flex;" + delimiter + 
			"  flex-direction: column;" + delimiter + 
			"  max-width: 1000px;" + delimiter + 
			"  background: #fff;" + delimiter + 
			"  margin: 0px auto;" + delimiter + 
			"  text-align: center;" + delimiter + 
			"}" + delimiter + 
			"#container header {" + delimiter + 
			"  font-size: 32px;" + delimiter + 
			"  margin-top: 25px;" + delimiter + 
			"}" + delimiter + 
			"#container .date {" + delimiter + 
			"  font-size: 20px;" + delimiter + 
			"  font-weight: 600;" + delimiter + 
			"  margin-bottom: 0;" + delimiter + 
			"}" + delimiter + 
			"#container .needToKnow {" + delimiter + 
			"  font-size: 13px;" + delimiter + 
			"  margin-top: 2px;" + delimiter + 
			"  margin-bottom: 30px;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".postContainer {" + delimiter + 
			"  width: 900px;" + delimiter + 
			"  height: 240px;" + delimiter + 
			"  background: #f3f6f8;" + delimiter + 
			"  border-radius: 10px;" + delimiter + 
			"  padding: 8px 16px;" + delimiter + 
			"  margin: 0 auto;" + delimiter + 
			"  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);" + delimiter + 
			"  display: flex;" + delimiter + 
			"  position: relative;" + delimiter + 
			"  text-align: left;" + delimiter + 
			"  margin-bottom: 40px;" + delimiter + 
			"  transition-duration: .5s;" + delimiter + 
			"}" + delimiter + 
			".postContainer .mainImage {" + delimiter + 
			"  width: 320px;" + delimiter + 
			"  height: 256px;" + delimiter + 
			"  background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);" + delimiter + 
			"  margin: 0;" + delimiter + 
			"  top: -8px;" + delimiter + 
			"  left: -16px;" + delimiter + 
			"  border-bottom-left-radius: 10px;" + delimiter + 
			"  border-top-left-radius: 10px;" + delimiter + 
			"  padding: 0;" + delimiter + 
			"  position: relative;" + delimiter + 
			"  z-index: 5;" + delimiter + 
			"  overflow: hidden;" + delimiter + 
			"}" + delimiter + 
			".postContainer .mainImage .image {" + delimiter + 
			"  object-fit: cover;" + delimiter + 
			"  height: 260px;" + delimiter + 
			"  width: 320px;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".postContainer:hover {" + delimiter + 
			"  transform: translateY(-5px);" + delimiter + 
			"  box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".detailContainer {" + delimiter + 
			"  width: 580px;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .detailTopLeft {" + delimiter + 
			"  width: 85%;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .detailTopRight {" + delimiter + 
			"  width: 10%;" + delimiter + 
			"  background: transparent;" + delimiter + 
			"  float: right;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .detailTopRight button {" + delimiter + 
			"  height: 35px;" + delimiter + 
			"  width: 90px;" + delimiter + 
			"  font-size: 16px;" + delimiter + 
			"  font-weight: 500;" + delimiter + 
			"  border-radius: 2px;" + delimiter + 
			"  background: transparent;" + delimiter + 
			"  color: rgba(0, 0, 0, 0.6);" + delimiter + 
			"  border: 1px solid rgba(0, 0, 0, 0.6);" + delimiter + 
			"  transition: all 300ms ease-in-out;" + delimiter + 
			"  transition-timing-function: ease-in-out;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .detailTopRight button:hover {" + delimiter + 
			"  color: rgba(0, 0, 0, 0.9);" + delimiter + 
			"  border: 2px solid rgba(0, 0, 0, 0.9);" + delimiter + 
			"  background: rgba(0, 0, 0, 0.1);" + delimiter + 
			"  cursor: pointer;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .title {" + delimiter + 
			"  font-size: 20px;" + delimiter + 
			"  font-weight: 600;" + delimiter + 
			"  margin: 0;" + delimiter + 
			"  text-overflow: ellipsis;" + delimiter + 
			"}" + delimiter + 
			".detailContainer .author {" + delimiter + 
			"  font-size: 14px;" + delimiter + 
			"  margin: 1px 0px;" + delimiter + 
			"  color: rgba(0, 0, 0, 0.5);" + delimiter + 
			"}" + delimiter + 
			".detailContainer .detail {" + delimiter + 
			"  font-size: 14px;" + delimiter + 
			"  line-height: 20px;" + delimiter + 
			"  text-overflow: ellipsis;" + delimiter + 
			"  height: 35px;" + delimiter + 
			"  overflow: hidden;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".editorPickContainer {" + delimiter + 
			"  height: 90px;" + delimiter + 
			"  border-radius: 10px;" + delimiter + 
			"  border: 1px solid rgba(0, 0, 0, 0.1);" + delimiter + 
			"  padding: 8px 16px;" + delimiter + 
			"  background-color: #fff;" + delimiter + 
			"}" + delimiter + 
			".editorPickContainer .editorsPick {" + delimiter + 
			"  font-size: 14px;" + delimiter + 
			"  color: rgba(0, 0, 0, 0.5);" + delimiter + 
			"}" + delimiter + 
			".editorPickContainer .imageContainer {" + delimiter + 
			"  width: 25px;" + delimiter + 
			"  margin: 4px;" + delimiter + 
			"}" + delimiter + 
			".editorPickContainer .editorsPickDetail {" + delimiter + 
			"  font-size: 14px;" + delimiter + 
			"  line-height: 20px;" + delimiter + 
			"  margin: 4px 5px;" + delimiter + 
			"  overflow: hidden;" + delimiter + 
			"  height: 40px;" + delimiter + 
			"}" + delimiter + 
			".editorPickContainer .seeMore {" + delimiter + 
			"  color: #3d94c4;" + delimiter + 
			"  font-size: 14px;" + delimiter + 
			"  font-weight: 600;" + delimiter + 
			"  margin: 4px 5px;" + delimiter + 
			"}" + delimiter + 
			"" + delimiter + 
			".authorImage {" + delimiter + 
			"  height: 25px;" + delimiter + 
			"  width: 25px;" + delimiter + 
			"  border-radius: 50%;" + delimiter + 
			"}" + delimiter+
			"</style>" + delimiter + 
			
			"</head>" + delimiter + 
			"" + delimiter + 
			"<body>" + delimiter + 
			"" + delimiter + 
			"<div id=\"root\"><div>" + 
			"" + delimiter +
			"<script type=\"text/babel\">" + delimiter +
			"const generateRandomUserImage = () => {" + delimiter + 
			"  let random = Math.floor(Math.random() * 70);" + delimiter + 
			"  let gender = ['men', 'women'][Math.floor(Math.random() * 2)];" + delimiter + 
			"  return `https://randomuser.me/api/portraits/${gender}/${random}.jpg`;" + delimiter + 
			"};" + delimiter + 
			"" + delimiter + 
			"const PostContainer = props => {" + delimiter + 
			"  const { authorImage, content, description, urlToImage, detail, title, author, source, url, editorsPick } = props.metaData;" + delimiter + 
			"  return (" + delimiter + 
			"    React.createElement(\"div\", { className: \"postContainer\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"mainImage\" }," + delimiter + 
			"    React.createElement(\"img\", { className: \"image\", src: urlToImage }))," + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"div\", { className: \"detailContainer\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"flex\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"detailTopLeft\" }," + delimiter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }, React.createElement(\"p\", { className: \"title hover\" }, title && title.slice(0, 93)))," + delimiter + 
			"    React.createElement(\"p\", { className: \"author\" }, \"By \", author && author.slice(0, 30), \", Editor at \", source && source.name))," + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"div\", { className: \"detailTopRight\" }," + delimiter + 
			"    React.createElement(\"button\", null, \"Share\")))," + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }," + delimiter + 
			"    React.createElement(\"p\", { className: \"detail hover\" }, description && description.slice(0, 165), \"...\"))," + delimiter + 
			"    React.createElement(\"div\", { className: \"editorPickContainer hover\" }," + delimiter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"editorsPick\" }, \"Editors' Pick\")," + delimiter + 
			"    React.createElement(\"div\", { className: \"flex\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"imageContainer\" }," + delimiter + 
			"    React.createElement(\"img\", { className: \"authorImage\", src: authorImage || generateRandomUserImage() }))," + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"div\", { className: \"flexColumn\" }," + delimiter + 
			"    React.createElement(\"div\", { className: \"editorsPickDetail\" }, content && content.slice(0, 140), \"...\")," + delimiter + 
			"    React.createElement(\"div\", { className: \"seeMore\" }, \"See what people are saying -> \"))))))));" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"};" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"const App = () => {" + delimiter + 
			"  const [articles, setArticles] = React.useState([]);" + delimiter + 
			"  React.useEffect(() => {" + delimiter + 
			"    fetch('http://newsapi.org/v2/top-headlines?country=in&apiKey=d88837678f904443affbc28f7ee13ce1').then(data => {" + delimiter + 
			"      const jsonData = data.json();" + delimiter + 
			"      return jsonData;" + delimiter + 
			"    }).then(results => {" + delimiter + 
			"      const articles = results.articles;" + delimiter + 
			"      console.log(articles[0]);" + delimiter + 
			"      setArticles(articles);" + delimiter + 
			"    });" + delimiter + 
			"  }, []);" + delimiter + 
			"  return (" + delimiter + 
			"    React.createElement(\"div\", { id: \"container\" }," + delimiter + 
			"    React.createElement(\"header\", null, \"Daily Rundown\")," + delimiter + 
			"    React.createElement(\"p\", { className: \"date\" }, moment(Date.now()).format('dddd, MMMM D'))," + delimiter + 
			"    React.createElement(\"p\", { className: \"needToKnow\" }, React.createElement(\"a\", { href: \"https://in.linkedin.com/in/sukanta-banerjee-6ab375100\", target: \"_blank\" }, \"Sukanta\"), \", here's what you need to know today\")," + delimiter + 
			"    React.createElement(\"main\", null," + delimiter + 
			"    articles.map(post => React.createElement(PostContainer, { metaData: post, key: post.title })))," + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"div\", { className: \"bottom\" }," + delimiter + 
			"    React.createElement(\"p\", null, \"You\\u2019re all caught up on today\\u2019s top news\")," + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"    React.createElement(\"p\", null, \"Have a great day\"))));" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"" + delimiter + 
			"};" + delimiter + 
			"ReactDOM.render(React.createElement(App, null), document.getElementById('root'));" + 
			"</script>" + delimiter +
			"</body>" + delimiter + 
			
			"</html>";
	
}
