// Adding props to a component
function Person(props){
    return(
        <div>
            <h2>My name is {props.name}</h2>
            <p>My age is {props.age}</p>
            <p>My favorite color is {props.favColor}</p>
        </div>
    )
}

export default Person;