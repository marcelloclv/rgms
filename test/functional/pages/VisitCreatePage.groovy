package pages

import geb.Page

import rgms.tool.TwitterTool

class VisitCreatePage extends Page {
	static url = "visit/create"

	static at = {
		//this.name == "Visitante"
	}

	static content = {
	}

	def clickOnCreate(){
	  $('input.save').click()
	}

	def fillVisitDetailsTwitter() {
		$("form").visitor = "Visitante"
		$("form").descricao = "Primeira Visita"

		$("input.save").click()

		TwitterTool.addTwitterHistory("Primeira Visita",null)
	}

	def fillVisitDetails() {
		$("form").visitor = "Visitante"
		$("form").descricao = "Primeira Visita"

		$("input.save").click()

	}
}