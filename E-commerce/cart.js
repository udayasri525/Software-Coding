function displayCart() {
  let cart = JSON.parse(localStorage.getItem("cart")) || [];
  let container = document.getElementById("cart-items");
  let total = 0;

  if (!container) return;

  container.innerHTML = "";

  cart.forEach(item => {
    total += item.price * item.quantity;

    container.innerHTML += `
      <div class="cart-box">
        <img src="${item.image}">
        <div>
          <h3>${item.name}</h3>
          <p>₹${item.price}</p>
          <p>Qty: ${item.quantity}</p>
          <button onclick="removeItem('${item.name}')">Remove</button>
        </div>
      </div>
    `;
  });

  document.getElementById("total-price").innerText = "₹" + total;
}

function removeItem(name) {
  let cart = JSON.parse(localStorage.getItem("cart")) || [];
  cart = cart.filter(item => item.name !== name);

  localStorage.setItem("cart", JSON.stringify(cart));
  displayCart();
}

displayCart();