# taller4Informatica

## Calculo de credito variable

Para el calculo del credito variable se debe consumir una operación POST a la url
~~~
[ip]:[port]/creditCalculator
~~~
con header:
~~~
Content-Type : application/json
~~~
y contenido en el body

Para calcular por cuotas
~~~json
{
	"credito" : {
		"monto" : 200000,
		"plazo" : 10,
		"tasaInteres" : 5.0,
		"tipo" : false //variable 
	}
}
~~~

Para calcular por monto
~~~json
{
	"credito" : {
		"monto" : 200000,
		"cuota" : 10000,
		"tasaInteres" : 5.0,
		"tipo" : true //fijo
	}
}
~~~

La respuesta es:
~~~json
{
	"cuotas" : [
			{
				"saldo" : 99000,
				"abonoCapital" : 999,
				"interesGenerado" : 100,
				"amortización" : 1000,
				"cuota" : 1
			},
			
			{
				"saldo" : 99000,
				"abonoCapital" : 999,
				"interesGenerado" : 100,
				"amortización" : 1000,
				"cuota" : 2
			},
			
			{
				"saldo" : 99000,
				"abonoCapital" : 999,
				"interesGenerado" : 100,
				"amortización" : 1000,
				"cuota" : 2
			}
		],
	"totalCuotas" : 100
}
~~~