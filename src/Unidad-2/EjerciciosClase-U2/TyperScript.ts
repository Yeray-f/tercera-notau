// Función principal
function main(): void {
    const mayor = encontrarMayor(10, 20, 5);
    console.log("El número mayor es:", mayor);
}

// Función que devuelve el mayor de tres números
function encontrarMayor(a: number, b: number, c: number): number {
    return Math.max(a, Math.max(b, c));
}

// Llamada al método principal
main();
