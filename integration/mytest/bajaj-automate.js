

describe("my test case",()=>{


beforeEach(()=>{
    cy.viewport(1994,1600);

})

it("visit to google and bajaj health",()=>{
    cy.visit("http://www.google.com/");
    cy.get('input[name="q"]').type("Bajaj Finserve Health {enter}")
    cy.contains("Bajaj Finserv Health - Your Personalized Healthcare Platform").click();
    cy.url().should('include','bajajfinservhealth.in')
    
})

it("next test case",()=>{
     cy.get("#searchBarInput").type("doctor {enter}");
     cy.get('.css-1kj8wbb a').first().click();
     cy.get('div.MuiGrid-root.MuiGrid-container div div.slotTimeContainer a').first().click();
    
    
})
it("screenshot",()=>{
    cy.screenshot();
})

})

// cy.get('div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3  div:first-of-type div.slotTimeContainer a').first().click();
    //  cy.url().should('include','search?packageId=0231a17e5ff74db9a96b1021aebc7883&offer=Flat75&offerid=24&journey=&term=doctor&page=1&econsult=true')


//     it.skip("google test",()=>{
//         cy.visit("http://automationpractice.com/index.php");

//         cy.contains('Sign in').click();
//         cy.url().should('include','controller=authentication&back=my-account')

//         // cy.get('#email_create').type('Neerajkhurana363@gmail.com');
//         // cy.contains("Create an account").click();
//         // cy.url().should('include','controller=authentication&back=my-account#account-creation')
// })

// it.skip('information',()=>{
//     cy.get("#email").type('Neerajkhurana363@gmail.com');
//     cy.get("#passwd").type("12345678");
//     cy.contains('Sign in').click();
// })