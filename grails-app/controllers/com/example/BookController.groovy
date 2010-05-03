package com.example

class BookController {

	def list = {
		render {
			Book.findAll()
		}
	}
}
