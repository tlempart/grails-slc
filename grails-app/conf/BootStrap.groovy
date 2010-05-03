class BootStrap {

     def init = { servletContext ->
	1000.times {
	   new com.example.Book(title: "Tytuł {it}").save()
        }
     }
     def destroy = {
     }
} 
