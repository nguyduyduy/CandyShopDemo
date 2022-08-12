
let button = document.getElementById("button");

button.addEventListener('click', async() => {



    try{
        const raw_response = await fetch(`http://localhost:8080/app/candies`);

        if(!raw_response.ok){
            throw new Error(raw_response.status)
        }

        const json_data = await raw_response.json()

        console.log(json_data);

        var input = document.getElementById("input");
        var candyName = document.createElement("candy")

        input.innerHTML = `${json_data[0].name} is my favorite candy!`
        input.append(candyName)

        var input2 = document.getElementById("input2")
        var price = document.createElement("price")

        input2.innerHTML = `The price of this candy is $${json_data[0].price}!`
        input2.append(price)

        var input3 = document.getElementById("input3")
        var shopName = document.createElement("shopName")

        input3.innerHTML = `You can buy this candy at ${json_data[0].shop.shopName}`
        input3.append(shopName)

        alert("CANDY IS GOOD FOR YOU")

        
    
    } catch (error) {
        console.log(error)
    }
})