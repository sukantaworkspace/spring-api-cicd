package org.spring.cicd.newsfeedapp.constant;

public class HtmlTemplateConstants {
	
	//Listened to code coverage
	private HtmlTemplateConstants() {}
	
	//Repetition removed
	public static final String  delimeter = "\r\n";

	public static final String NEWS_TEMPLATE = "<!DOCTYPE html>" + delimeter + 
			"<html>" + delimeter + 
			"<head>" + delimeter + 
			"<script src=\"https://unpkg.com/react@16/umd/react.production.min.js\"></script>" + delimeter + 
			"<script src=\"https://unpkg.com/react-dom@16/umd/react-dom.production.min.js\"></script>" + delimeter + 
			"<script src=\"https://unpkg.com/babel-standalone@6.15.0/babel.min.js\"></script>" + delimeter+
			"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js\"></script>" + delimeter+
			"<style>" + delimeter + 
			"html," + delimeter + 
			"body {" + delimeter + 
			"  height: 100%;" + delimeter + 
			"  width: 100%;" + delimeter + 
			"  margin: 0;" + delimeter + 
			"  font-family: -apple-system, system-ui, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Fira Sans, Ubuntu, Oxygen, Oxygen Sans, Cantarell;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".flex {" + delimeter + 
			"  display: flex;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".flexColumn {" + delimeter + 
			"  display: flex;" + delimeter + 
			"  flex-direction: column;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".hover:hover {" + delimeter + 
			"  cursor: pointer;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			"a {" + delimeter + 
			"  text-decoration: none;" + delimeter + 
			"  color: black;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			"#container {" + delimeter + 
			"  width: 100%;" + delimeter + 
			"  height: 100%;" + delimeter + 
			"  display: flex;" + delimeter + 
			"  flex-direction: column;" + delimeter + 
			"  max-width: 1000px;" + delimeter + 
			"  background: #fff;" + delimeter + 
			"  margin: 0px auto;" + delimeter + 
			"  text-align: center;" + delimeter + 
			"}" + delimeter + 
			"#container header {" + delimeter + 
			"  font-size: 32px;" + delimeter + 
			"  margin-top: 25px;" + delimeter + 
			"}" + delimeter + 
			"#container .date {" + delimeter + 
			"  font-size: 20px;" + delimeter + 
			"  font-weight: 600;" + delimeter + 
			"  margin-bottom: 0;" + delimeter + 
			"}" + delimeter + 
			"#container .needToKnow {" + delimeter + 
			"  font-size: 13px;" + delimeter + 
			"  margin-top: 2px;" + delimeter + 
			"  margin-bottom: 30px;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".postContainer {" + delimeter + 
			"  width: 900px;" + delimeter + 
			"  height: 240px;" + delimeter + 
			"  background: #f3f6f8;" + delimeter + 
			"  border-radius: 10px;" + delimeter + 
			"  padding: 8px 16px;" + delimeter + 
			"  margin: 0 auto;" + delimeter + 
			"  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);" + delimeter + 
			"  display: flex;" + delimeter + 
			"  position: relative;" + delimeter + 
			"  text-align: left;" + delimeter + 
			"  margin-bottom: 40px;" + delimeter + 
			"  transition-duration: .5s;" + delimeter + 
			"}" + delimeter + 
			".postContainer .mainImage {" + delimeter + 
			"  width: 320px;" + delimeter + 
			"  height: 256px;" + delimeter + 
			"  background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);" + delimeter + 
			"  margin: 0;" + delimeter + 
			"  top: -8px;" + delimeter + 
			"  left: -16px;" + delimeter + 
			"  border-bottom-left-radius: 10px;" + delimeter + 
			"  border-top-left-radius: 10px;" + delimeter + 
			"  padding: 0;" + delimeter + 
			"  position: relative;" + delimeter + 
			"  z-index: 5;" + delimeter + 
			"  overflow: hidden;" + delimeter + 
			"}" + delimeter + 
			".postContainer .mainImage .image {" + delimeter + 
			"  object-fit: cover;" + delimeter + 
			"  height: 260px;" + delimeter + 
			"  width: 320px;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".postContainer:hover {" + delimeter + 
			"  transform: translateY(-5px);" + delimeter + 
			"  box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".detailContainer {" + delimeter + 
			"  width: 580px;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .detailTopLeft {" + delimeter + 
			"  width: 85%;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .detailTopRight {" + delimeter + 
			"  width: 10%;" + delimeter + 
			"  background: transparent;" + delimeter + 
			"  float: right;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .detailTopRight button {" + delimeter + 
			"  height: 35px;" + delimeter + 
			"  width: 90px;" + delimeter + 
			"  font-size: 16px;" + delimeter + 
			"  font-weight: 500;" + delimeter + 
			"  border-radius: 2px;" + delimeter + 
			"  background: transparent;" + delimeter + 
			"  color: rgba(0, 0, 0, 0.6);" + delimeter + 
			"  border: 1px solid rgba(0, 0, 0, 0.6);" + delimeter + 
			"  transition: all 300ms ease-in-out;" + delimeter + 
			"  transition-timing-function: ease-in-out;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .detailTopRight button:hover {" + delimeter + 
			"  color: rgba(0, 0, 0, 0.9);" + delimeter + 
			"  border: 2px solid rgba(0, 0, 0, 0.9);" + delimeter + 
			"  background: rgba(0, 0, 0, 0.1);" + delimeter + 
			"  cursor: pointer;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .title {" + delimeter + 
			"  font-size: 20px;" + delimeter + 
			"  font-weight: 600;" + delimeter + 
			"  margin: 0;" + delimeter + 
			"  text-overflow: ellipsis;" + delimeter + 
			"}" + delimeter + 
			".detailContainer .author {" + delimeter + 
			"  font-size: 14px;" + delimeter + 
			"  margin: 1px 0px;" + delimeter + 
			"  color: rgba(0, 0, 0, 0.5);" + delimeter + 
			"}" + delimeter + 
			".detailContainer .detail {" + delimeter + 
			"  font-size: 14px;" + delimeter + 
			"  line-height: 20px;" + delimeter + 
			"  text-overflow: ellipsis;" + delimeter + 
			"  height: 35px;" + delimeter + 
			"  overflow: hidden;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".editorPickContainer {" + delimeter + 
			"  height: 90px;" + delimeter + 
			"  border-radius: 10px;" + delimeter + 
			"  border: 1px solid rgba(0, 0, 0, 0.1);" + delimeter + 
			"  padding: 8px 16px;" + delimeter + 
			"  background-color: #fff;" + delimeter + 
			"}" + delimeter + 
			".editorPickContainer .editorsPick {" + delimeter + 
			"  font-size: 14px;" + delimeter + 
			"  color: rgba(0, 0, 0, 0.5);" + delimeter + 
			"}" + delimeter + 
			".editorPickContainer .imageContainer {" + delimeter + 
			"  width: 25px;" + delimeter + 
			"  margin: 4px;" + delimeter + 
			"}" + delimeter + 
			".editorPickContainer .editorsPickDetail {" + delimeter + 
			"  font-size: 14px;" + delimeter + 
			"  line-height: 20px;" + delimeter + 
			"  margin: 4px 5px;" + delimeter + 
			"  overflow: hidden;" + delimeter + 
			"  height: 40px;" + delimeter + 
			"}" + delimeter + 
			".editorPickContainer .seeMore {" + delimeter + 
			"  color: #3d94c4;" + delimeter + 
			"  font-size: 14px;" + delimeter + 
			"  font-weight: 600;" + delimeter + 
			"  margin: 4px 5px;" + delimeter + 
			"}" + delimeter + 
			"" + delimeter + 
			".authorImage {" + delimeter + 
			"  height: 25px;" + delimeter + 
			"  width: 25px;" + delimeter + 
			"  border-radius: 50%;" + delimeter + 
			"}" + delimeter+
			"</style>" + delimeter + 
			
			"</head>" + delimeter + 
			"" + delimeter + 
			"<body>" + delimeter + 
			"" + delimeter + 
			"<div id=\"root\"><div>" + 
			"" + delimeter +
			"<script type=\"text/babel\">" + delimeter +
			"const generateRandomUserImage = () => {" + delimeter + 
			"  let random = Math.floor(Math.random() * 70);" + delimeter + 
			"  let gender = ['men', 'women'][Math.floor(Math.random() * 2)];" + delimeter + 
			"  return `https://randomuser.me/api/portraits/${gender}/${random}.jpg`;" + delimeter + 
			"};" + delimeter + 
			"" + delimeter + 
			"const PostContainer = props => {" + delimeter + 
			"  const { authorImage, content, description, urlToImage, detail, title, author, source, url, editorsPick } = props.metaData;" + delimeter + 
			"  return (" + delimeter + 
			"    React.createElement(\"div\", { className: \"postContainer\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"mainImage\" }," + delimeter + 
			"    React.createElement(\"img\", { className: \"image\", src: urlToImage }))," + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"div\", { className: \"detailContainer\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"flex\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"detailTopLeft\" }," + delimeter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }, React.createElement(\"p\", { className: \"title hover\" }, title && title.slice(0, 93)))," + delimeter + 
			"    React.createElement(\"p\", { className: \"author\" }, \"By \", author && author.slice(0, 30), \", Editor at \", source && source.name))," + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"div\", { className: \"detailTopRight\" }," + delimeter + 
			"    React.createElement(\"button\", null, \"Share\")))," + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }," + delimeter + 
			"    React.createElement(\"p\", { className: \"detail hover\" }, description && description.slice(0, 165), \"...\"))," + delimeter + 
			"    React.createElement(\"div\", { className: \"editorPickContainer hover\" }," + delimeter + 
			"    React.createElement(\"a\", { href: url, target: \"_blank\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"editorsPick\" }, \"Editors' Pick\")," + delimeter + 
			"    React.createElement(\"div\", { className: \"flex\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"imageContainer\" }," + delimeter + 
			"    React.createElement(\"img\", { className: \"authorImage\", src: authorImage || generateRandomUserImage() }))," + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"div\", { className: \"flexColumn\" }," + delimeter + 
			"    React.createElement(\"div\", { className: \"editorsPickDetail\" }, content && content.slice(0, 140), \"...\")," + delimeter + 
			"    React.createElement(\"div\", { className: \"seeMore\" }, \"See what people are saying -> \"))))))));" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"};" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"const App = () => {" + delimeter + 
			"  const [articles, setArticles] = React.useState([]);" + delimeter + 
			"  React.useEffect(() => {" + delimeter + 
			"    fetch('https://newsapi.org/v2/top-headlines?country=in&apiKey=d88837678f904443affbc28f7ee13ce1').then(data => {" + delimeter + 
			"      const jsonData = data.json();" + delimeter + 
			"      return jsonData;" + delimeter + 
			"    }).then(results => {" + delimeter + 
			"      const articles = results.articles;" + delimeter + 
			"      console.log(articles[0]);" + delimeter + 
			"      setArticles(articles);" + delimeter + 
			"    });" + delimeter + 
			"  }, []);" + delimeter + 
			"  return (" + delimeter + 
			"    React.createElement(\"div\", { id: \"container\" }," + delimeter + 
			"    React.createElement(\"header\", null, \"Daily Rundown\")," + delimeter + 
			"    React.createElement(\"p\", { className: \"date\" }, moment(Date.now()).format('dddd, MMMM D'))," + delimeter + 
			"    React.createElement(\"p\", { className: \"needToKnow\" }, React.createElement(\"a\", { href: \"https://in.linkedin.com/in/sukanta-banerjee-6ab375100\", target: \"_blank\" }, \"Sukanta\"), \", here's what you need to know today\")," + delimeter + 
			"    React.createElement(\"main\", null," + delimeter + 
			"    articles.map(post => React.createElement(PostContainer, { metaData: post, key: post.title })))," + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"div\", { className: \"bottom\" }," + delimeter + 
			"    React.createElement(\"p\", null, \"You\\u2019re all caught up on today\\u2019s top news\")," + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"    React.createElement(\"p\", null, \"Have a great day\"))));" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"" + delimeter + 
			"};" + delimeter + 
			"ReactDOM.render(React.createElement(App, null), document.getElementById('root'));" + 
			"</script>" + delimeter +
			"</body>" + delimeter + 
			
			"</html>";
	
}
