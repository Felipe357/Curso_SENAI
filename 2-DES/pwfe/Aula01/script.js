var a = 5;
var b = 7;
var c = 6;

if(a == b && a == c && b == c) {console.log("equilátero") }
else if( a != b && a != c && b != c) {console.log("escaleno")}
else {console.log("isósceles")}



// let salarios = [3200, 2500, 4000];

// salarios.forEach(salario => {
//     if (salario < 1903.98) {
//         console.log("Está isento de taxa")
//     } else if(salario < 2826.66) {
//         let r1 = salario + (salario * 7.5 / 100)
//         console.log(`Terá que pagar um taxa de 7,50% ${r1}`)
//     } else if(salario < 3751.06) {
//         let r1 = salario + (salario * 15 / 100)
//         console.log(`Terá que pagar um taxa de 15% ${r1}`)
//     } else if(salario < 4664.68) {
//         let r1 = salario + (salario * 22.5 / 100)
//         console.log(`Terá que pagar um taxa de 22,50% ${r1}`)
//     } else {
//         let r1 = salario + (salario * 27.5 / 100)
//         console.log(`Terá que pagar uma taxa de 27,50% ${r1}`)
//     }
// })


// var qntFilho = window.prompt("Digite quantos filhos você tem:")

// var salario = window.prompt("Digite seu salário:")

// if(salario > 1655.98){
//     window.alert("Você não tem direito ao salário família")
// } else {
//     var result = qntFilho * 56.47
//     window.alert(`Você receberá ${result} R$`)
// }