# taller4Informatica

## Calculo de credito variable

Para el calculo del credito variable se debe consumir una operación POST a la url
~~~
localhost:8080/creditCalculator/variable
~~~
con header:
~~~
Content-Type : application/json
~~~
y contenido en el body
~~~json
{
	"credito" : {
		"monto" : 200000,
		"plazo" : 10,
		"tasaInteres" : 5.0 
	}
}
~~~

La respuesta es:
~~~json
{
	"cuotas" : [
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 1,
				"cuotas" : 99
			},
			
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 2,
				"cuotas" : 99
			},
			
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 3,
				"cuotas" : 99
			}
		],
	"totalCuotas" : 100
}
~~~

## Calculo de credito fijo

Para el calculo del credito variable se debe consumir una operación POST a la url
~~~
localhost:8080/creditCalculator/fijo
~~~
con header:
~~~
Content-Type : application/json
~~~
y contenido en el body
~~~json
{
	"credito" : {
		"monto" : 200000,
		"plazo" : 10,
		"tasaInteres" : 5.0 
	}
}
~~~

La respuesta es:
~~~json
{
	"cuotas" : [
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 1,
				"cuotas" : 99
			},
			
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 2,
				"cuotas" : 99
			},
			
			{
				"saldo" : 99000,
				"bonoCapital" : 999,
				"interesGenerado" : 1,
				"amortización" : 1000,
				"cuota" : 3,
				"cuotas" : 99
			}
		],
	"totalCuotas" : 100
}
~~~