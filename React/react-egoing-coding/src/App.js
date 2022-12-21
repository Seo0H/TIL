import logo from './logo.svg';
import './App.css';
import React, {Link} from 'react';

function Header(props){
  return(
    <header>
        <h1><a href="/">{ props.title }</a></h1>
    </header>
  );
}

function Nav(props){
  // const {id, title, body} = props.topics;
  const lis = [
    <li><a href="/read/1">html</a></li>,
    <li><a href="/read/2">css</a></li>,
    <li><a href="/read/3">js</a></li>,
  ];

  return(
    <nav>
        <ol>
          {props.map(id => (
            <li><Link to={`/read/${id}`}>{title}</Link></li>
          ))}
        </ol>
      </nav>
  );
}

function Article(props){
  return(
    <article>
        <h2>{props.title}</h2>
        {props.body}
    </article>
  );
}

function App() {

  const topics = [
  {
    id:1,
    title:'html',
    body:'html is ...'
  },
  {
    id:2,
    title:'css',
    body:'css is ...'
  },
  {
    id:3,
    title:'js',
    body:'js is ...'
  },
];

  return (
    <div>
      <Header title="REACT"/>
      <Nav topics = {topics} />
      <Article title="Welcome" body="Hello, WEB"/>
    </div>
  );
}

export default App;
