@RestController

class App {
	@RequestMapping("/")
	def home() {
		def header = "<html><body>"
		def content = "<h1>Hello!</h1><p>this is html content.</p>"
		def footer = "</body></html>"
		header + content + footer
	}
}
